package com.mchlslwnsk;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        // if else control statements

        boolean gameOver = true;
        int score = 800;
        int lvlCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Michal", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jack", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Steven", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore <= 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore <= 500) {
            return 3;
        }
        return 4;
    }
}
