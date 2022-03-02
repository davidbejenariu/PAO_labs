package com.company.examples;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] myArray2 = new int[5];
        double[] myArray3 = new double[5];

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myArray2));
        System.out.println(Arrays.toString(myArray3));

        int[][] myMatrix = new int[3][3];
        int[][] myMatrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(myMatrix));
        System.out.println(Arrays.deepToString(myMatrix2));
    }
}
