package com.hatayan.Lesson4;

public class ReverseArrayElements {
    static int [] array = {1,2,3,4,5,6};
    public static void main(String[] args) {
        reverseNumbersInArray(array);
    }
    public static void reverseNumbersInArray (int[] array) {
        int i = array.length -1;
        int index;
        while (i > -1){
            System.out.print(array[i] + " ");
            i--;
        }
    }
}
