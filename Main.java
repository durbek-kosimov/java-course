package com;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        String name = "Dris";
        int position = 0;

        calculateScore(gameOver, score, levelCompleted, bonus);
        position = calculateHighScorePosition(score);
        displayHighscorePosition("Dris", position);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        position = calculateHighScorePosition(score);
        displayHighscorePosition("Mertens", position);
    }

    public static void displayHighscorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500 && score < 1000)
            return 2;
        else if (score >= 100 && score < 500)
            return 3;
        else
            return 4;

//        if (score >= 1000)
//            return 1;
//        else if (score >= 500)
//            return 2;
//        else if (score >= 100)
//            return 3;
//        else
//            return 4;
//
//        int position = 4;
//        if (score >= 1000)
//            position = 1;
//        else if (score >= 500)
//            position = 2;
//        else if (score >= 100)
//            position = 3;
//        return 4;
    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
