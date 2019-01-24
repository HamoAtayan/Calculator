package com.hatayan.LessonSecond;

import java.util.Scanner;

public class LoopForWithScanner {
   static Scanner scanner = new Scanner(System.in);

   static int FirstNumber = 2;
   static int SecondNumber = 0;

   public static int compareNumbers(){
       while (FirstNumber > SecondNumber){
           System.out.println("Pleases type First number as First Number cannot be bigger than Second Number");
           FirstNumber = scanner.nextInt();
           System.out.println("Please type Second Number");
           SecondNumber = scanner.nextInt();
       }

       return SecondNumber - FirstNumber;
   }


   public static void MultiplyOfThree(){
       for (int i = FirstNumber; i < SecondNumber; i++){
           if (i % 3 == 0){
               System.out.println(i);
           }
       }
   }

    public static void main(String[] args) {
            compareNumbers();
            MultiplyOfThree();
            }
        }
