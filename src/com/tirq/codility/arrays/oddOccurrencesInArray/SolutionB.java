package com.tirq.codility.arrays.oddOccurrencesInArray;

import java.util.Arrays;

public class SolutionB {

    public static void main(String[] args) {
        SolutionB s = new SolutionB();
        int[] array = {9, 5, 3, 3, 5, 7, 9};
        int odd = s.solution(array);
        System.out.println("odd:" + odd);
    }

    public static int solution(int[] array) {
        final int[] value = {0};
        Arrays.stream(array).forEach(i -> value[0] ^= i);
        return value[0];
    }
}
