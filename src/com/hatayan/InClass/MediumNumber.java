package com.hatayan.InClass;

public class MediumNumber {
    public static void main(String[] args) {

    }
    public double mijinOfMaxAndMin(double[] array) {
        double maximum = 0;
        double minimum = 0;
        for (double element : array) {
            if (element > maximum) {
                maximum = element;
            }
            if (element < minimum){
                minimum = element;
            }
        }
        return (maximum + minimum) / 2;


    }
}
