package com.hatayan.LessonSecond;

import java.util.Scanner;

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
        detectOperation();

    }

    public static void initializeFirstNumber(){
        System.out.println("please enter first number:" );
        firstNumber = scanner.nextDouble();
    }

    public static void initializeSecondNumber(){
        System.out.println("please enter second number");
        secondNumber = scanner.nextDouble();
    }

    public static void recognizeInvalidOperators() {
        operator = "";
        while ((operator != "+") || (operator != "-") || (operator != "*") || (operator != "/")) {
            System.out.println("please enter operators + or - or * or / ");
            operator = scanner.next();
                if ((operator == "+") || (operator == "-" )||(operator ==  "*" )|| (operator == "/")){
                    detectOperation();
                    break;
            }
                else continue;
        }
    }

        public static void detectOperation(){

            if (operator == "+") {
                answer = (firstNumber + secondNumber);
                System.out.println("answer is:" + answer);

            }

            if (operator == "-") {
                answer = (firstNumber - secondNumber);
                System.out.println("answer is:" + answer);

            }

            if (operator == "*") {
                answer = (firstNumber * secondNumber);
                System.out.println("answer is:" + answer);

            }
            if (operator == "/") {
                answer = (firstNumber / secondNumber);
                System.out.println("answer is:" + answer);
            }


        }


}







