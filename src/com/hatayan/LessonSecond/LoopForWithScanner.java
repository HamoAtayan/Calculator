package com.hatayan.LessonSecond;

import java.util.Scanner;

public class LoopForWithScanner {
   static Scanner scanner = new Scanner(System.in);


   static int FirstNumber = scanner.nextInt();
   static int SecondNumber = scanner.nextInt();

   public static void compareNumbers(){
       while (FirstNumber > SecondNumber){
           System.out.println("1st input cannot be bigger than 2nd input");

       }
   }
   public static void range(){
       for (int i = FirstNumber; i < (SecondNumber - FirstNumber); i++){
           if (i % 3 == 0){
               System.out.println(i);
           }

       }
   }

    public static void main(String[] args) {
        compareNumbers();
        range();
    }
}
