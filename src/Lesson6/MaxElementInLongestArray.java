package Lesson6;

public class MaxElementInLongestArray {
    static int[][] table = {
            {7, 8, 9, 7},
            {4, 5},
            {1, 2, 3, 6},
            {4, 5, 8, 9, 7, 8}
    };


    public static void main(String[] args) {
        int [] dxk = maxOfArrays();
        bubbleSort(dxk);
       int output = dxk.length -1;
        System.out.println(dxk[output]);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static int[] maxOfArrays() {
        int value = 1;
        for (int i = 0; i < table.length; i++) {
            if (table[i].length > table[value].length) {
                table[value] = table[i];
                System.out.println(table[value]);
            }

        }
        return table[value];
    }


}