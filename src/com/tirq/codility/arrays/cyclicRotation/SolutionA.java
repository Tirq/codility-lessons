package com.tirq.codility.arrays.cyclicRotation;

public class SolutionA {

    public static void main(String[] args) {
        SolutionA s = new SolutionA();
        int[] array = {3, 8, 9, 7, 6};
        int[] rotated = s.solution(array, 3);
        for (int element : rotated) {
            System.out.println(element);
        }
    }

    public int[] solution(int[] array, int times) {
        while (array.length > 0 && times-- > 0) {
            array = rotate(array);
        }
        return array;
    }

    private int[] rotate(int[] array) {
        int[] rotated = new int[array.length];
        rotated[0] = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            rotated[i + 1] = array[i];
        }
        return rotated;
    }
}
