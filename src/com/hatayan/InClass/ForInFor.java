package com.hatayan.InClass;

public class ForInFor {
    public static void main(String[] args) {
taxtak();
    }
    public static void taxtak() {
        for (int i = 0; i < 5 ; i++ ){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
