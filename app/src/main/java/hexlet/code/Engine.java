package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ATTEMPTS = 3; // Количество попыток игры
    public static final int MAX_ROWS = 3;
    public static final int MAX_COLUMNS = 2;



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
