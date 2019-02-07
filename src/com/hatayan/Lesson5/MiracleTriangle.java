package com.hatayan.Lesson5;

public class MiracleTriangle {
     static int maxrows = 8;

    public static void main(String[] args) {
        MiracleTriangle();
    }

    public static void MiracleTriangle() {
        for (int i = 0; i <= maxrows; i++) {
            for (int j = 0; j <= maxrows; j++) {
                if(i < j + 4 && i > j - 4 && i > -j + 4 && i < -j + 12){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}
