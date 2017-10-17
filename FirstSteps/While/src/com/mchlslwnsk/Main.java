package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {


//        int count = 0;
//        while (count != 5) {
//
//            System.out.println("Count value is " + count);
//            count++;
//            //without count+ its a inifinite loop
//        }

        //  System.out.println("***************************");
//        count =6;
//        do{
//            System.out.println("count value was " + count);
//            count++;
//            if(count>100){
//                break;
//            }
//        } while(count!=6);

        //    System.out.println("********************************");
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is" + count);
//            count++;
//        }
//        System.out.println(isEvenNumber(5));
        int number =6;
        int totalNumber = 6;
        int finalNumber = 20;
        int counter =0;
        while (number <= finalNumber) {
            //       System.out.println(isEvenNumber(number));
            if (!isEvenNumber(number)) {
                number++;
                counter++;
                totalNumber=totalNumber+number;

                if (counter ==5){
                    System.out.println("Counter is " + counter);
                    break;
                }
                continue;
            }

            //System.out.println("Even number is " + number);
            System.out.println("Total number is "+ totalNumber);
            number++;
        }

    }
    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;

        } else {
            return false;
        }
    }
}
