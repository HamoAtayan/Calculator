package com.hatayan.Lesson4;

//3. Grel method vor kveradarcni mi array vory trvac arrayi hakarakn a, aysinqn ira mej elementnery dasavorvac en hakarak hertakanutyamb.
public class ReverseArrayElements {
    static int[] array = {1, 2, 3, 4, 5, 6};
    static int i;

    public static void main(String[] args) {
        reverseArray(array);
    }

    public static int[] reverseArray(int[] array) {
        //First Solution
       /* int[] array2 = new int[array.length];
        int index = 0;
        for (i = array.length - 1; i > -1; i--) {
            array2[index] = array[i];
            index++;
        }
        return array2;
    }*/

       //Second Solution
        int k;
        for (int i = 0; i< array.length/2;i++){
        k = array[i];
        array[i] = array [array.length -1 -i];
        array[array.length -1 -i] = k;
        }
        return array;
    }
}
