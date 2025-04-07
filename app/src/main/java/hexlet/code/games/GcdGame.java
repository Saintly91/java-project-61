package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {
    private static final int MAX_NUMBERS = 200;
    private static final String GAME_QUESTION = "Find the greatest common divisor of given numbers."; // Правила игры

    public static int findGCD(int a, int b) {
        while (b != 0) { // цикл нахождения НОД
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void gcd() { // Метод НОД (наибольший общий делитель)
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив вопросов и ответов
        String question; // Переменная с вопросом
        int result = 0; // Переменная с результатом

        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) { // Цикл присвоения случайных чисел и выявления НОД
            int a = Utils.getRandomNumbers(1, MAX_NUMBERS); // первое случайное число
            int b = Utils.getRandomNumbers(1, MAX_NUMBERS); // второе случайное число
            int originalA = a;
            int originalB = b;
            result = findGCD(a, b);
            question = originalA + " " + originalB; // Вопрос
            // присваиваем вопросы и ответы в массив data
            data[i][0] = question;
            data[i][1] = String.valueOf(result);
        }
        Engine.gameEngine(data, GAME_QUESTION); // Вызываем метод "движка" игры
    }
}
