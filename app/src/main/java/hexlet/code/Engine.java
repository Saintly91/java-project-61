package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ATTEMPTS = 3; // Количество попыток игры
    public static final int MAX_ROWS = 3;
    public static final int MAX_COLUMNS = 2;
    private static final int FIRST_ODD_PRIME = 3;

    public static int getRandomNumbers(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) { // цикл нахождения НОД
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String arithmeticOperation(String[] operation) {
        int operations = getRandomNumbers(0, operation.length); // случайная арифм. операция
        return operation[operations];
    }

    public static boolean isPrime(int number) { // Метод проверки простого числа
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = FIRST_ODD_PRIME; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static String[] generateProgression(int maxPosition, int maxIncrement, int maxLength) {
        String[] progression = new String[maxLength]; // создаем массив из 10 чисел
        int initPosition = getRandomNumbers(1, maxPosition);
        int randomIncrement = getRandomNumbers(1, maxIncrement);
        for (int i = 0; i < maxLength; i++) {
            progression[i] = String.valueOf(initPosition + i * randomIncrement); // Заполняем числа
        }
        return progression;
    }

    public static void gameEngine(String[][] inputData, String gameRules) { // Метод движка игры
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!"); // Блок приветствия игрока
        System.out.print("May I have your name? ");
        String name = sc.nextLine(); // Игрок вводит свое имя
        System.out.println("Hello, " + name + "!"); // Приветствуем игрока
        System.out.println(gameRules); // Правила игры

        for (int i = 0; i < MAX_ATTEMPTS; i++) { // Цикл ответов на вопросы
            String question = inputData[i][0]; // Вопрос
            String answer = inputData[i][1]; // Ответ

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String playerAnswer = sc.nextLine().trim(); // Ввод ответа от пользователя

            if (playerAnswer.equals(answer)) { // Цикл проверки ответа игрока
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        sc.close();
    }
}
