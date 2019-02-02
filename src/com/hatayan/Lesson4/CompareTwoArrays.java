package com.hatayan.Lesson4;

public class CompareTwoArrays {
    static int[] arrOne = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
    static int[] arrTwo = {1, 3, 5, 7, 9, 11, 13,};

    public static void main(String[] args) {
        ComparetDuplicateNumbers(arrOne, arrTwo);
    }

    public static void ComparetDuplicateNumbers(int[] arrayFirst, int[] arraySecond) {
        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arraySecond.length; j++) {
                if (arrayFirst[i] == arraySecond[j]) {
                    System.out.println("Duplicetes are: " + arrayFirst[i]);
                }
            }
        }
    }
}
