package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ATTEMPTS = 3; // Количество попыток игры
    public static String name;
    static Scanner sc = new Scanner(System.in);
    static int correctAnswerCount = 0; // Количество правильных ответов

    public static void greetUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!"); // Блок приветствия игрока
        System.out.print("May I have your name? ");
        name = sc.nextLine(); // Игрок вводит свое имя
        System.out.println("Hello, " + name + "!"); // Приветствуем игрока
    }
    public static void gameEngine(String[][] inputData, String gameRules) { // Метод принимающий параметр вопрос/ответ и правила игры
        greetUser();
        System.out.println(gameRules); // Правила игры

        for (int i = 0; i < MAX_ATTEMPTS; i++) { // Цикл ответов на вопросы
            String question = inputData[0][i]; // Вопрос
            String result = inputData[1][i]; // Ответ

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = sc.nextLine(); // Ввод ответа от пользователя

            if (answer.equals(result)) { // Цикл проверки ответа игрока
                correctAnswerCount++;
                System.out.println("Correct!");
                if (correctAnswerCount == 3) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + name + "!");
            }
        }
    }
}
