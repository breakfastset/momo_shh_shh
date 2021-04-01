/*
Program will ask for 5 scores
program will print the highest, lowest and total scores
 */

import java.util.Scanner;

public class ScoresApp {

    public static void main(String[] args) {
        Scanner userInputObj = new Scanner(System.in);

        double highest, lowest, total;
        double score;
        highest = -1;
        lowest = 999;
        total = 0;

        System.out.print("Enter score (-ve to exit): ");
        score = userInputObj.nextDouble();

        while (score >= 0) {
            if (score > highest) {
                highest = score;
            }

            total += score;  // add to total

            System.out.println("Highest score: " + highest);
            System.out.println("Total score: " + total);
            System.out.print("Enter score (-ve to exit): ");
            score = userInputObj.nextDouble();
        }

    }
}
