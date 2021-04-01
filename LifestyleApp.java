import java.util.Scanner;

public class LifestyleApp {

    public static void main(String[] args) {
        /* Create input object */
        Scanner userInputObj = new Scanner(System.in);

        /* declare all inputs */
        char gender;
        int age;
        String lifestyle;
        int calories;

        /* 1. Prime the Loop - Get user inputs */
        System.out.print("M or F? ");  // prompt for gender
        gender = userInputObj.nextLine().charAt(0);  // first character
        System.out.print("Age? ");
        age = userInputObj.nextInt();
        userInputObj.nextLine();      // get the next line
        System.out.print("Lifestyle? ");
        lifestyle = userInputObj.nextLine();
        calories = -1;

        while (age >= 0) {   // 2. condition - exit only if age is negative

            // 3. suite of statements to be executed
            if (gender == 'M') {
                if (age >= 18 && age <= 24) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 2600;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2800;
                    } else if (lifestyle.equals("active")) {
                        calories = 3000;
                    }
                } else if (age >= 25 && age <= 30) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 2400;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2800;
                    } else if (lifestyle.equals("active")) {
                        calories = 3000;
                    }
                } else if (age >= 31 && age <= 40) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 2400;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2600;
                    } else if (lifestyle.equals("active")) {
                        calories = 3000;
                    }
                }
            } else if (gender == 'F') {
                if (age >= 18 && age <= 25) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 2000;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2200;
                    } else if (lifestyle.equals("active")) {
                        calories = 2400;
                    }
                } else if (age >= 26 && age <= 30) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 1800;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2000;
                    } else if (lifestyle.equals("active")) {
                        calories = 2400;
                    }
                } else if (age >= 31 && age <= 40) {
                    if (lifestyle.equals("sedentary")) {
                        calories = 1800;
                    } else if (lifestyle.equals("moderate")) {
                        calories = 2000;
                    } else if (lifestyle.equals("active")) {
                        calories = 2200;
                    }
                }
            }


            if (calories != -1) {
                System.out.println("Calories needed: " + calories);
            } else {
                System.out.println("The following could be invalid: ");
                System.out.println("(a) gender (M or F only!)");
                System.out.println("(b) age (18 to 40 only)");
                System.out.println("(c) Lifestyle: sedentary, moderate or active");
            }

            /* 4. Update the Loop - Get user inputs */
            System.out.print("M or F? ");  // prompt for gender
            gender = userInputObj.nextLine().charAt(0);  // first character
            System.out.print("Age? ");
            age = userInputObj.nextInt();
            userInputObj.nextLine();      // get the next line
            System.out.print("Lifestyle? ");
            lifestyle = userInputObj.nextLine();
            calories = -1;

        } // end of while loop

        System.out.println("Thank you for using the system!");

    }  // end of main
}  // end of class
