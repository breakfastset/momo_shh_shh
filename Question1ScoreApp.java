import java.util.Scanner;

public class Question1ScoreApp {

    public static void main(String[] args) {
        Scanner userInputObj = new Scanner(System.in);

        int numScores = 0;
        int numFailures = 0;
        double totalScore = 0;
        double highestScore = 0;
        double score;

        System.out.print("Enter a score ( -ve to exit): ");
        score = userInputObj.nextDouble();

        while (score >= 0) {  // exit if user keys in negative score
            if (score > 100) {
                System.out.println("Invalid score range! Score must be between 0 – 100");
            } else {
                String grade = "";
                if (score >= 80) {
                    grade = "A";
                }
                else if (score >= 70 && score < 80) {
                    grade = "B";
                }
                else if (score >= 60 && score < 70) {
                    grade = "C";
                }
                else if (score >= 50 && score < 60) {
                    grade = "D";
                }
                else {
                    grade = "F";
                    numFailures += 1;
                }
                System.out.println("Grade is " + grade);
                totalScore = totalScore + score;
                numScores = numScores + 1;
                if (score > highestScore) {
                    highestScore = score;
                }
            }

            // Ask for input again
            System.out.print("Enter a score ( -ve to exit): ");
            score = userInputObj.nextDouble();

        } // end of while
        System.out.println("Number of scores: " + numScores);
        System.out.println("Number of passes: " + (numScores - numFailures));
        System.out.println("Number of failures: " + numFailures);
        System.out.println("Average score: " + totalScore/numScores);
        System.out.println("Highest: " + highestScore);


    } // end of main
}
