package com.company;

public class Main {

    public static void main(String[] args) {

        //width of 16(2bytes)
	    //unicode-table.com/en/#control-character
        char myChar = '\u00AE';
        char myChar2= '\u00A9';
        System.out.println("Unicode chars: "+myChar + myChar2);

        boolean myBoolean = true;
        boolean isMale = false;

    }
}
