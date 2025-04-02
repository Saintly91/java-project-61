package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GcdGame;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("your choice: ");
        int gameNumber = sc.nextInt();
        System.out.print("\n");

        switch (gameNumber) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Even.parityCheck();
                break;
            case 3:
                Calc.calculator();
                break;
            case 4:
                GcdGame.gcd();
                break;
            case 5:
                Progression.numberIsMissing();
                break;
            case 6:
                Prime.primeCheck();
                break;
            default:
                break;
        }

        sc.close();
    }
}
