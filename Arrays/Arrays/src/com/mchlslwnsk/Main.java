package com.mchlslwnsk;

import java.util.Scanner;

public class Main {


    //scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myInt = getInt(3);
        for (int i = 0; i < myInt.length; i++) {
            System.out.println("Element " + i + " value is " + myInt[i]);
        }
        System.out.println("The average is: " + getAvg(myInt));
    }

    //input numbers
    public static int[] getInt(int number) {
        System.out.println("Enter " + number);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //average
    public static double getAvg(int[] array){
       int sum = 0;
       for (int i=0; i<array.length;i++){
           sum +=  array[i];
       }
       //return average
       return (double) sum / (double) array.length;
    }

}

//        double[] doublesArray = new double[5];
//
//        for (int i = 0; i<doublesArray.length;i++){
//            doublesArray[i] = i*10;
//        }
//        myDoublesArray(doublesArray);
//    }
//
//    public static void myDoublesArray(double[] array){
//        for (int i=0; i<array.length;i++){
//            System.out.println("Element " + i +", value is " + array[i]);
//        }


