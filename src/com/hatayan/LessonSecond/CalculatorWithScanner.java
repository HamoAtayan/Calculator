package com.hatayan.LessonSecond;

import java.util.Scanner;

public class CalculatorWithScanner {

      static   Scanner scanner = new Scanner(System.in);

       static double firstNumber = scanner.nextDouble();
       static double secondNumber = scanner.nextDouble();
       static String action = scanner.next();
       static double output;

    public static double inputFirstNumber(){
        firstNumber = scanner.nextDouble();
        return firstNumber;
    }

    public static double inputSecondNumber(){
        secondNumber = scanner.nextDouble();
        return secondNumber;
    }

    public static double action () {
            String dxk = "please type + - * /";
            while (action != "+" || action != "-" || action != "*" || action != "/") {
                System.out.println("please type actions: +, -, *, / ");
                action = scanner.next();
                if (action == "+"){
                    output = inputFirstNumber() + inputSecondNumber();
                    System.out.println(output);
                }
            }
            return output;
            }
            

    public static void Sum(){

    }


    public static void main(String[] args) {
        System.out.println("please type first number");
        System.out.println(inputFirstNumber());
        System.out.println(action());
        System.out.println("please type first number");
        System.out.println(inputSecondNumber());

    }
        // grel metod vory kani / i depqum return secondnumber



}
