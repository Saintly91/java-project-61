package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static boolean isPrime(int number) { // Метод проверки простого числа
        if (number <= 1) {
            return false;
        }
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i * i <= number ; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void primeCheck() { // Метод проверки простого числа
        String[][] data = new String[2][3]; // Создаем массив для хранения вопросов и ответов
        String gameQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'."; // Правила игры
        String result; // Переменная с результатом

        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 100); // Присваиваем случайное число
            // Блоки проверки, является ли число простым
            result = isPrime(randomNum) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[0][i] = String.valueOf(randomNum);
            data[1][i] = (result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
