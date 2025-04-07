package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int FIRST_ODD_PRIME = 3;
    private static final int MAX_NUMBERS = 100;
    private static final String GAME_QUESTION =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'."; // Правила игры

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

    public static void primeCheck() { // Метод проверки простого числа
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив вопросов и ответов
        String result; // Переменная с результатом

        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) {
            int randomNum = Utils.getRandomNumbers(1, MAX_NUMBERS); // Присваиваем случайное число
            // Блоки проверки, является ли число простым
            result = isPrime(randomNum) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[i][0] = String.valueOf(randomNum);
            data[i][1] = (result);
        }
        Engine.gameEngine(data, GAME_QUESTION); // Вызываем метод "движка" игры
    }
}
