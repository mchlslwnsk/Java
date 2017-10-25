package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {
        // if else control statements

        boolean gameOver = true;
        int score = 800;
        int lvlCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver,score,lvlCompleted,bonus);

         score = 10000;
         lvlCompleted = 8;
         bonus = 200;

        calculateScore(gameOver,score,lvlCompleted,bonus);
    }

    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus){

        if (gameOver){
            int finalScore = score +(lvlCompleted*bonus);
            finalScore+=2000;
            System.out.println("Yor final score was "+finalScore);
            return finalScore;
        }
        return -1;

    }



}
