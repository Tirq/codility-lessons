package com.tirq.codility.timeComplexity.permMissingElem;

public class SolutionA {

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int[] array = {4, 2, 1, 5, 6};
        int missed = s.solution(array);
        System.out.println(missed);
    }

    public int solution(int[] array) {
        long a = array.length + 1;
        Long sum = a * (a + 1) / 2;
        for (int i : array) {
            sum -= i;
        }
        return sum.intValue();
    }
}
