package com.hatayan.Lesson2;

import java.util.Scanner;
// ctrl alt l
public class CalculatorWithScanner {
    static Scanner scanner = new Scanner(System.in);

    static double firstNumber;
    static double secondNumber;
    static String operator;
    static double answer;

    public static void main(String[] args) {
        initializeFirstNumber();
        initializeSecondNumber();
        recognizeInvalidOperators();
//        detectOperation();

    }

    public static void initializeFirstNumber() {
        System.out.println("please enter first number:");
        firstNumber = scanner.nextDouble();
    }

    public static void initializeSecondNumber() {
        System.out.println("please enter second number");
        secondNumber = scanner.nextDouble();
    }

    public static void recognizeInvalidOperators() {
        operator = "";
        while (!(operator.equals("+")) || !(operator.equals("-")) || !(operator.equals("*")) || !(operator.equals("/"))) {
            System.out.println("please enter operators + or - or * or / ");
            operator = scanner.next();

                detectOperation(operator);
        }
        
    }

    public static void detectOperation(String operator) {

        if (operator.equals("+")) {
            answer = (firstNumber + secondNumber);
            System.out.println("answer is:" + answer);

        }

        if (operator.equals("-")) {
            answer = (firstNumber - secondNumber);
            System.out.println("answer is:" + answer);

        }

        if (operator.equals("*")) {
            answer = (firstNumber * secondNumber);
            System.out.println("answer is:" + answer);

        }
        if (operator.equals("/")) {
            answer = (firstNumber / secondNumber);
            System.out.println("answer is:" + answer);
        }


    }


}







