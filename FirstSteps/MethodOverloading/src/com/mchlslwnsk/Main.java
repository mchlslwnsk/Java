package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {

//calculated Score method
//        int newScore = calculateScore("Michal", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(100);
//        calculateScore();
        // calculated and convert inches and feets to centimeters
        double centimeters = calcFeetAndInchesToCentimeters(6d, 0d);
        if (centimeters < 0d) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);

    }
//
//    public static int calculateScore(String playerName, int score) {
//        System.out.println(playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name and no points");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 || (inches >= 0 && inches <= 12)) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches =" + centimeters + " cm ");
            return centimeters;

        } else {
            System.out.println("Parameter incorrect");
            return -1d;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " remaining inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else
            System.out.println("Its not true");
        return -1d;
    }


}
