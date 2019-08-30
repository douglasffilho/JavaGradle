package br.com.douglasffilho.javagradle

import br.com.douglasffilho.javagradle.logging.StopWatch
import groovy.util.logging.Slf4j

import java.util.concurrent.atomic.AtomicLong

import static java.util.stream.Collectors.toList

@Slf4j
class MainApplication {

    static void main(String[] args) {
        log.info('testing "for" loop types iterating over 1 to 1.000.000 integer array')

        def range = 1..1000000
        def count = 0

        StopWatch.timeWatchedExecute("Java map() to iterate", {
            count = 0
            final AtomicLong atomicCount = new AtomicLong(0)
            range.stream().map({ item ->
                atomicCount.set(atomicCount.get() + 1)
                return item
            }).collect(toList())
            count = atomicCount.get()
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Groovy collect() to iterate", {
            count = 0
            range.collect { count++ }
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Normal for() loop", {
            count = 0
            for (def i = 0; i < range.last(); i++) {
                count++
            }
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Groovy for (item in items) loop", {
            count = 0
            for (i in range) {
                count++
            }
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Java for (item:items) loop", {
            count = 0
            for (def i : range) {
                count++
            }
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Java forEach() loop", {
            count = 0
            range.forEach({ count++ })
        })
        log.info('count is {}', count)

        StopWatch.timeWatchedExecute("Groovy each() loop", {
            count = 0
            range.each { count++ }
        })
        log.info('count is {}', count)

    }
}
