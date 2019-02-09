package Lesson6;

//  Method vory kveradracni table-i amenaerkar arrayi lengthy.
public class MaxOfArraysLenght {

    static int[][] table = {
            {7, 8, 9, 7},
            {4, 5},
            {1, 2, 3, 6},
            {4, 5, 8, 9, 7, 8}
    };

    public static int maxOfArrays() {
        int value = 1;
        for (int i = 0; i < table.length; i++) {
            if (table[i].length > table[value].length) {
                table[value] = table[i];
                System.out.println(table[value]);
            }

        }
        return table[value].length;
    }
}



