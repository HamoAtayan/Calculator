package com.hatayan.Lesson5;

public class RightTriangle {
    public static void main(String[] args) {
        printRightTriangle();
    }
    public static void printRightTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
