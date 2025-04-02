package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ATTEMPTS = 3; // Количество попыток игры

    public static void gameEngine(String[][] inputData, String gameRules) { // Метод движка игры
        Scanner sc = new Scanner(System.in);
        int correctAnswerCount = 0; // Количество правильных ответов
        System.out.println("Welcome to the Brain Games!"); // Блок приветствия игрока
        System.out.print("May I have your name? ");
        String name = sc.nextLine(); // Игрок вводит свое имя
        System.out.println("Hello, " + name + "!"); // Приветствуем игрока
        System.out.println(gameRules); // Правила игры

        for (int i = 0; i < MAX_ATTEMPTS; i++) { // Цикл ответов на вопросы
            String question = inputData[i][0]; // Вопрос
            String result = inputData[i][1]; // Ответ

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
        sc.close();
    }
}
