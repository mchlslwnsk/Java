package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("value 1");
//        } else if (value == 2) {
//            System.out.println("value 2");
//        } else {
//            System.out.println("value 1 or 2");
//        }

//        int switchValue=2;
//        switch(switchValue){
//            case 1:
//                System.out.println("value 1");
//                break;
//
//            case 2:
//                System.out.println("vale 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("value 3,4 or 5");
//                System.out.println(" value is " + switchValue);
//                break;
//
//            default:
//                System.out.println("value was not above");
//                break;
//        }

//        char charValue='U';
//        switch (charValue){
//            case 'A':
//                System.out.println("value A");
//                break;
//            case 'B':
//                System.out.println("value B");
//                break;
//            case 'C': case 'D':
//                System.out.println("value C or D");
//                break;
//            default:
//                System.out.println("other value");
//                break;
//        }

        String month = "jANuarY";

        switch (month.toLowerCase()) {
        //bad practise    case "January": case "JANUARY":
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            default:
                System.out.println("other month");
                break;
        }


    }
}
