import java.util.Scanner;

public class Tests {
    private double average;
    private int scoreCount;

    public Tests() {
        average = 0.0;
        scoreCount = 0;
    }

    public double getAverageValue() {
        return average;
    }

    public int getScoreCount() {
        return scoreCount;
    }

    public void getAverage() {
        Scanner scnr = new Scanner(System.in);
        double sum = 0.0;
        scoreCount = 0;
        System.out.println("Enter test scores (-1 to quit): ");
        double score = scnr.nextDouble(); 
        while (score != -1) {
            sum = sum + score;
            scoreCount++;
            System.out.println("Enter test scores (-1 to quit): ");
            score = scnr.nextDouble();
        }
        average = sum / scoreCount;
    }

    public String toString() {
        return "The average of the " + scoreCount +
               " scores entered is " +
               String.format("%.2f", average) + ".";
    }
}
