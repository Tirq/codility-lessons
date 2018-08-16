package com.tirq.codility.iterations.binaryGap;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionB {

    public static void main(String[] args) {
        SolutionB s = new SolutionB();
        System.out.println(s.solution(1041));
    }

    public int solution(int value) {
        return findGreatestGap(trimZeros(Integer.toBinaryString(value)));
    }

    private String trimZeros(String s) {
        return removeStartZeros(new StringBuilder(removeStartZeros(s)).reverse().toString());
    }

    private String removeStartZeros(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        return s;
    }

    private int findGreatestGap(String number) {
        return Arrays.stream(number.split("1"))
                .max(Comparator.comparingInt(String::length))
                .orElse("").length();
    }
}
