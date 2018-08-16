package com.tirq.codility.iterations.binaryGap;

public class SolutionA {

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        System.out.println(s.solution(42));
    }

    public int solution(int value) {
        String number = Integer.toBinaryString(value);
        number = trimZeros(number);
        int greatestGap = findGreatestGap(number);
        return greatestGap;
    }

    private String trimZeros(String s) {
        s = removeStartZeros(s);
        s = removeEndZeros(s);
        return s;
    }

    private String removeStartZeros(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        return s;
    }

    private String removeEndZeros(String s) {
        while (s.endsWith("0")) {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }

    private int findGreatestGap(String number) {
        String[] gaps = number.split("1");
        int greatestGap = 0;
        for (String gap : gaps) {
            if (greatestGap < gap.length()) {
                greatestGap = gap.length();
            }
        }
        return greatestGap;
    }
}
