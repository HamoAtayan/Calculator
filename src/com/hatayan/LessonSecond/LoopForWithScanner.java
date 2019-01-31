package com.hatayan.LessonSecond;
//shift f6 to replace everywhere
import java.util.Scanner;

public class LoopForWithScanner {
    static Scanner scanner = new Scanner(System.in);

    static int FirstNumber;
    static int SecondNumber;

    public static void main(String[] args) {
        inputRange();
        int mybajanarar = inputBajanarar();
        findMultiplies(FirstNumber,SecondNumber,mybajanarar);
    }


    public static void inputRange() {
        System.out.print("Pleases type start of Range: ");
        FirstNumber = scanner.nextInt();
        System.out.print("Please type Second Number: ");
        SecondNumber = scanner.nextInt();
        if (FirstNumber >= SecondNumber) {
            System.out.println("Second number should be bigger than start of Range");
            inputRange();
        }
    }

    public static int inputBajanarar() {
        int bajanarar = scanner.nextInt();
        return bajanarar;
    }

    public static void findMultiplies(int x, int y, int z) {
        for (int i = x; i <= y; i++) {
            if (i % z == 0) {
                System.out.println("multiply of" + z + "is: " + i);
            }
        }
    }
}
