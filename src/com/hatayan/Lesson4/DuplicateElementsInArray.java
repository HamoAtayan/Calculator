package com.hatayan.Lesson4;
//4. Grel method vor ktpi krknvogh elementnery stacac arrayi mijic
public class DuplicateElementsInArray {
    static int[] arr = {1, 2, 5, 2, 8, 5, 12, 12};

    public static void main(String[] args) {
        returnDuplicate(arr);
    }

    public static void returnDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1 ; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate numbers are :" + array[i]);
                }
            }
        }
    }
}

