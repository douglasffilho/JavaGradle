package br.com.douglasffilho.javagradle.logging

import groovy.util.logging.Slf4j

@Slf4j
class StopWatch {

    private static final Integer TIMES = 1000

    static void timeWatchedExecute(String message, Closure execution) {
        List<Integer> times = (1..TIMES)
        List<Long> executionTimes = []

        for (i in times) {
            long start = System.nanoTime()
            execution()
            executionTimes << System.nanoTime() - start
        }

        Double avgTime = (executionTimes.sum(0) / TIMES) / 1e+6

        log.info('{} : execution duration is {}ms', message, avgTime.round(3))
    }

}
