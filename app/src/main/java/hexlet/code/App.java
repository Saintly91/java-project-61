package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Your choice: 1");
                Cli.greetUser();
                break;
            case 2:
                System.out.println("Your choice: 2");
                Even.parityCheck();
                break;
            case 0:
                System.out.println("Your choice: 0");
                break;
        }

        sc.close();
    }
}
