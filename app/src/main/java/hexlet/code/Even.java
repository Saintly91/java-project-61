package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void parityCheck() {
        Cli.greetUser();
        Scanner in = new Scanner(System.in);
        int correctAnswerCount = 0;

        for (int i = 0; i < 3; i++) {
            int randomNum = 1 + (int) (Math.random() * 100);
            String result = (randomNum % 2 == 0) ? "yes" : "no";
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String answer = in.nextLine();

            if (answer.equals(result)) {
                correctAnswerCount++;
                System.out.println("Correct!");
                if (correctAnswerCount == 3) {
                    System.out.println("Congratulations, " + Cli.getName() + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
            }
        }
    }
}
