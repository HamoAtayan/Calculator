package com.hatayan.LessonFirst;

public class CalculatorSecond {
    public static void main(String[] args) {
        System.out.println(Sum(1,3));
        System.out.println(Sub(5,2));
        System.out.println(Multiple(7,3));
        System.out.println(Devide(5,2));
    }
    public static int Sum(int a, int b){
        System.out.print(a + " + " + b + " = ");
        return  a + b;
    }
    public static int Sub(int a, int b){
        System.out.print(a + " - " + b + " = ");
        return  a - b;
    }
    public static int Multiple(int a, int b){
        System.out.print(a + " * " + b + " = ");
        return  a * b;
    }
    public static double Devide(double a, double b){
        System.out.print(a + " / " + b + " = ");
        return  a / b;
    }
}