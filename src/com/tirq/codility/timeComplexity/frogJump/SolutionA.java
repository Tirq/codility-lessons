package com.tirq.codility.timeComplexity.frogJump;

public class SolutionA {

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int steps = s.solution(1, 1, 3);
        System.out.println("steps: " + steps);
    }

    public int solution(int start, int end, int step) {
        int remain = end - start;
        int steps = remain / step;
        if (remain % step > 0) {
            steps++;
        }
        return steps;
    }

}