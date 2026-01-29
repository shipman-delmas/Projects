import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the first score? ");
        double firstScore = scnr.nextDouble();

        System.out.println("What is the second score? ");
        double secondScore = scnr.nextDouble();

        System.out.println("What is the third score? ");
        double thirdScore = scnr.nextDouble();

        System.out.println("Test Score 1: " + firstScore);
        System.out.println("Test Score 2: " + secondScore);
        System.out.println("Test Score 3: " + thirdScore);
        System.out.println("The average of the 3 test scores is: " + ((firstScore + secondScore + thirdScore) / 3));

    }
}
