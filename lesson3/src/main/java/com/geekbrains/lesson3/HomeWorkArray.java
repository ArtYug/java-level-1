package com.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkArray {
    public static void main(String[] args) {
            //1
     int [] array = {0,0,0,0,1,0,1,1,0,0};
        substitutionOfZeroAndOne(array);
     //2
     System.out.println();
     int [] array1  =new int[100];
        fillArray(array1);
     // 3
     System.out.println();
     int []  arrays = {1,5,3,2,11,4,5,2,4,8,9,1};
        numLess_6_Times_2(arrays);
     //4
     System.out.println();
     int [][] arr  = new  int[4][4];
        matrixDiagonalOne(arr);
     //5
     System.out.println();
        acceptingTwoArg(4,5);
     //6
     System.out.println();
     int [] arrayAnother  = {5,4,3,1,5,8,19,8};
     findMinMax(arrayAnother);
     //7
     System.out.println();
     int [] anArray  = {1,1,1,2,1};
     System.out.println(compareTwoSides(anArray));
     //8
     System.out.println();
     int[] arrays1 = {1,2,3,5,4,6};
     System.out.println("original array");
     System.out.println(Arrays.toString(arrays1));
     System.out.println("Array after the shift");
     shiftLeftRight(arrays1,-3);
     System.out.println(Arrays.toString(arrays1));
    }
    public static void substitutionOfZeroAndOne(int [] array){
    System.out.println("original array");
        for (int j : array) {
            System.out.print(j + " ");
        }
    System.out.println();
    System.out.println("replacing array");
        for (int i = 0; i <array.length ; i++) {
        if (array[i] == 0){
            array[i] = 1;
        }else{
           array[i] = 0;
        }
        System.out.print(array[i] + " ");
     }
    }
    public static void fillArray(int[] array1){
        for (int i = 0; i <= array1.length ; i++) {
            System.out.println(i);
        }
    }
    public static void numLess_6_Times_2(int[] arrays){
        System.out.println("original array");
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("array is a number less than 6 times two");
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6){
               arrays [i] *= 2;
            }
            System.out.print(arrays[i] + " ");
        }
    }
    public static void matrixDiagonalOne(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (i == j || (i == 0 && j == 3) || (i == 1 && j == 2) || (i == 3 && j == 0)|(i == 2 && j == 1)){
                    System.out.print("1");
                }else {
                    System.out.print("2");
                }
            }
            System.out.println(" ");
        }
    }
    public static void acceptingTwoArg(int len , int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(initialValue);
        }
    }
    public static void findMinMax(int[] arrayAnother) {
        int max = arrayAnother [0];
        int min = Integer.MAX_VALUE;
        for (int j : arrayAnother) {
            if (max < j) {
                max = j;
            } else {
                min = Math.min(j, min);
            }
        }
        System.out.println( " max number  equals : " + max);
        System.out.println( " min  number  equals : " + min);
    }
    public static boolean compareTwoSides(int[] anArray){
        int rightSide = 0;
        int leftSide = 0;
        for (int i = 0,j = anArray.length-1; i <= j;) {
         if (leftSide < rightSide){
             leftSide += anArray[i];
             i++;
         }else{
             rightSide += anArray[j];
             j--;
        }
        }
        return leftSide == rightSide;
    }
    public static void shiftLeftRight(int[] arrays1, int n){
        if (n > 0) {
            for (int i = 0; i < n; i++) {
             shiftArrayRight(arrays1);
            }
        }else {
            for (int i = 0; i < - n; i++) {
             shiftArrayLeft(arrays1);
            }

        }
    }
    public static void shiftArrayRight(int [] arrays1) {
        int last = arrays1[arrays1.length -1];
        System.arraycopy(arrays1, 0, arrays1, 1, arrays1.length - 1);
        arrays1[0] = last;
    }
    public static void shiftArrayLeft(int [] arrays1) {
        int first = arrays1[0];
        System.arraycopy(arrays1, 1, arrays1, 0, arrays1.length - 1);
        arrays1[arrays1.length -1] = first;
    }
}

