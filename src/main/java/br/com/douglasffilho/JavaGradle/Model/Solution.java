package br.com.douglasffilho.JavaGradle.Model;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] A) {

        AtomicInteger result = new AtomicInteger(1);

        int min = Arrays.stream(A).filter(val -> val > 0).min().getAsInt();
        int max = Arrays.stream(A).filter(val -> val > 0).max().getAsInt();

        IntStream.rangeClosed(min, max);

        return result.get();
    }

}
