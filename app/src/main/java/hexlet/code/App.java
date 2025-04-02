package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GcdGame;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALC + " - Calc\n"
                + GCD + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + "0 - Exit");
        System.out.print("your choice: ");
        int gameNumber = sc.nextInt();
        System.out.print("\n");

        switch (gameNumber) {
            case GREET:
                Cli.greetUser();
                break;
            case EVEN:
                Even.parityCheck();
                break;
            case CALC:
                Calc.calculator();
                break;
            case GCD:
                GcdGame.gcd();
                break;
            case PROGRESSION:
                Progression.numberIsMissing();
                break;
            case PRIME:
                Prime.primeCheck();
                break;
            default:
                break;
        }

        sc.close();
    }
}
