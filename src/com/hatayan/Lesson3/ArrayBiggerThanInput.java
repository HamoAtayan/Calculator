package com.hatayan.Lesson3;

/*1. Array enq haytararum u elementnery lcnum enq {45, 38, 475, .....}
      arrayi mijic tpum enq bolor en tvery voronq mets en mer mutqagrac tvic.
      ogtagorcelov foreach loop*/

import java.util.Scanner;

public class ArrayBiggerThanInput {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        comparingEveryIndex();
    }

    static int[] array = {20, 1, 700, 50, 9, 651, 90, 152, 196, 1005};

    static void comparingEveryIndex() {
        System.out.print("Please type number to compare: ");
        int number = scanner.nextInt();
        for (int element : array) {
            if (element > number) {
                System.out.println(element);
            }
        }
    }
}



