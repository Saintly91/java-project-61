package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void gcd() { // Метод НОД (наибольший общий делитель)
        String[][] data = new String[2][3]; // Создаем массив для хранения вопросов и ответов
        String gameQuestion = "Find the greatest common divisor of given numbers."; // Правила игры
        String question; // Переменная с вопросом
        int result = 0; // Переменная с результатом

        for (int i = 0; i < 3; i++) { // Цикл присвоения случайных чисел и выявления НОД
            int a = (int) (Math.random() * 200); // первое случайное число
            int b = (int) (Math.random() * 200); // второе случайное число
            int originalA = a;
            int originalB = b;
            while (b != 0) { // цикл нахождения НОД
                int temp = b;
                b = a % b;
                a = temp;
            }
        result = a;
            question = originalA + " " + originalB; // Вопрос
            // присваиваем вопросы и ответы в массив data
            data[0][i] = question;
            data[1][i] = String.valueOf(result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
