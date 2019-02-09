package Lesson6;

public class MinOfArraysLenght {
    static int[][] table = {
            {7, 8, 9, 7},
            {4, 5},
            {1, 2, 3, 6},
            {4, 5, 8, 9, 7, 8}
    };

    public static int minOfArrays() {
        int value = 1;
        for (int i = 0; i < table.length; i++) {
            if (table[i].length < table[value].length) {
                table[value] = table[i];
                System.out.println(table[value]);
            }

        }
        return table[value].length;
    }

}

