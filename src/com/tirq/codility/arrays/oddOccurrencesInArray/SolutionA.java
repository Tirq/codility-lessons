package com.tirq.codility.arrays.oddOccurrencesInArray;

public class SolutionA {

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int[] array = {9, 5, 3, 3, 5, 7, 9};
        int odd = s.solution(array);
        System.out.println("odd:" + odd);
    }

    public static int solution(int[] array) {
        int odd = 0;
        for (int i : array) {
            odd = odd ^ i;
        }
        return odd;
    }
}
