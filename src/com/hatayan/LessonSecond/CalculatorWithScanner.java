package com.hatayan.LessonSecond;

import java.util.Scanner;

public class CalculatorWithScanner {
   static Scanner scanner = new Scanner(System.in);

    static double firstNumber;
    static double secondNumber;
    static String operator;
    static double answer;

    public static void main(String[] args) {
        declareFirstNumber();
        declareSecondNumber();
        recognizeOperators();

    }

    public static void declareFirstNumber(){
        System.out.println("please enter first number:" );
        firstNumber = scanner.nextDouble();
    }

    public static void declareSecondNumber(){
        System.out.println("please enter second number");
        secondNumber = scanner.nextDouble();
    }

    public static void recognizeOperators() {
        operator = "";

        while ((operator != "+") || (operator != "-") || (operator != "*") || (operator != "/")) {
            System.out.println("please enter operators + or - or * or / ");
            operator = scanner.next();

            if (operator == "+") {
                answer = (firstNumber + secondNumber);
                System.out.println("answer is:" + answer);
                break;
            }

            if (operator == "-") {
                answer = (firstNumber - secondNumber);
                System.out.println("answer is:" + answer);
                break;
            }

            if (operator == "*") {
                answer = (firstNumber * secondNumber);
                System.out.println("answer is:" + answer);
                break;
            }
            if (operator == "/") {
                answer = (firstNumber / secondNumber);
                System.out.println("answer is:" + answer);
                break;
            }
        }


    }}



