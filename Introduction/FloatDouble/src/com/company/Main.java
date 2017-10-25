package com.company;

public class Main {

    public static void main(String[] args) {

        //width of int =32 (4bytes)
        int myIntValue = 5;
        //width of float = 32 (4bytes)
        float myFloatValue = 5f/3f;
        //width of double =64(8bytes)
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        double myPounds = 60d;
        double myKilograms = myPounds*0.4584950405;
        double myKilograms2 = myPounds*0.4584950405;
        System.out.format("%.2f%n", myKilograms);

    }
}
