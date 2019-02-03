package com.hatayan.Lesson4;

//2. Grel method vory kstana array yev mi tiv, trvac tvi indexy.
public class ArrayReturnNumIndex {


    public static int getIndexOfElement(int[] array, int number) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }
}