package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("Result 1: " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println("Result 2: " + previousResult + "-1=" + result);

        result += 2;
        result++;
        System.out.println("Result 3: " + result);


        //------------------------------------------------------
        //loops and operators

        boolean isAlien = false;
        if (isAlien) {
            System.out.println("Its not an alient");
        }
        int topScore = 80;
        int secondTopScore = 95;
        if ((topScore < 100) && (secondTopScore < 100)) ;
        System.out.println("You got the high score");

        if ((topScore > 90) || (secondTopScore <= 90)) ;
        System.out.println();

        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");
        else
            System.out.println("wasCar is false");

        //----------------------------------------------------------------
        //java operator precedense table






    }
}
