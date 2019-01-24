package br.com.douglasffilho.JavaGradle.Model;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] A) {

        AtomicInteger result = new AtomicInteger(1);

        IntStream intStream = Arrays.stream(A).filter(val -> val > 0);

        int min = intStream.min().getAsInt();
        int max = intStream.max().getAsInt();

        IntStream.rangeClosed(min, max);

        return result.get();
    }

}
