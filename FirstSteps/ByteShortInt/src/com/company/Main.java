package com.company;

public class Main {

    public static void main(String[] args) {

        //size of variables

        //int has a width of 32
	int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;

	int myTotal=(myMinValue/2);
        System.out.println("Int: " + myTotal);


        //byte has a width of 8
	byte myMinByteValue = -128;
	byte myMaxByteValue = 127;

	byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println("Byte: " + myNewByteValue);

        //short has a width of 16
	short myMinShortValue = -32768;
	short myMaxShortValue = 32767;
		System.out.println("Short: " + (short)(myMaxShortValue/2));

        //long has a width of 64
	long myMinLongvalue =9_223_372_036_854_775_807L;

    }
}
