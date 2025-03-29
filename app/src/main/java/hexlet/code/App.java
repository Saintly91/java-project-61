package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Your choice: 1");
                Engine.greetUser();
                break;
            case 2:
                System.out.println("Your choice: 2");
                Even.parityCheck();
                break;
            case 3:
                System.out.println("Your choice: 3");
                Calc.calculator();
                break;
            default:
                System.out.println("Your choice: 0");
                break;
        }

        sc.close();
    }
}
