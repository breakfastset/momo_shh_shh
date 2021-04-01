import java.util.Scanner;

public class RepetitionSentinelExample {

    public static void main(String[] args) {
        Scanner userInputObj = new Scanner(System.in);

        System.out.print("Enter a number (-1 to exit): ");
        int number = userInputObj.nextInt();  // init, priming the loop

        while (number != -1) {   // condition
            // statements
            System.out.println("you entered: " + number);


            // update input
            System.out.print("Enter a number (-1 to exit): ");
            number = userInputObj.nextInt();  // init, priming the loop

        }

    }

}
