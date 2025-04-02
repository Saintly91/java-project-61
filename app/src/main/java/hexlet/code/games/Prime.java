package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int MAX_NUMBERS = 100;
    private static final int FIRST_ODD_PRIME = 3;

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
        String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'."; // Правила игры
        String result; // Переменная с результатом

        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) {
            int randomNum = (int) (Math.random() * MAX_NUMBERS); // Присваиваем случайное число
            // Блоки проверки, является ли число простым
            result = isPrime(randomNum) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[i][0] = String.valueOf(randomNum);
            data[i][1] = (result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
