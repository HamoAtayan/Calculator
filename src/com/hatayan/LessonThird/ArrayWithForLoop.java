package com.hatayan.LessonThird;
/*Array enq haytararum 50 size-ov u elementnery lcnum enq for-ov 30-ic sksats amen 3-y mek, aysinqn 30, 33, 36 ...*/

public class ArrayWithForLoop {

    public static void main(String[] args) {
        insertElementsAfter29();
    }

    static int[] array = new int[50];

    public static void insertElementsAfter29() {
        for (int i = 30; i < 50; i += 3) {
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}
