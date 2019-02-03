package com.hatayan.InClass;

public class MaxOfArray {
    public static void main(String[] args) {

    }

    public double maxOfArray(int[] array) {
        int maximum = 0;
        for (int element : array) {
            if (element > maximum) {
                maximum = element;
            }
        }
        return maximum;
    }
}
