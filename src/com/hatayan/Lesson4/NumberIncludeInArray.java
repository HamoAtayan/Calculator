package com.hatayan.Lesson4;

// Grel method vory kstana array yev mi tiv, kveradarcni true ete et tivy ka arrayum.

public class NumberIncludeInArray {
    static int[] arr = {10, 20, 30, 501, 1, 37, 5009, 98, 6332};
    static int num = 5009;

    public static void main(String[] args) {
        System.out.println(checkNumberInArray(arr, num));
    }

    public static boolean checkNumberInArray(int[] array, int number) {
        for (int element : array) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }

}

