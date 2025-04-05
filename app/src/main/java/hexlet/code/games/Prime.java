package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int MAX_NUMBERS = 100;
    private static final String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'."; // Правила игры

    public static void primeCheck() { // Метод проверки простого числа
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив вопросов и ответов
        String result; // Переменная с результатом

        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) {
            int randomNum = Engine.getRandomNumbers(1, MAX_NUMBERS); // Присваиваем случайное число
            // Блоки проверки, является ли число простым
            result = Engine.isPrime(randomNum) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[i][0] = String.valueOf(randomNum);
            data[i][1] = (result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
