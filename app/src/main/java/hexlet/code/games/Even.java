package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MAX_NUMBERS = 100;

    public static void parityCheck() {
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив вопросов и ответов
        String result; // Переменная с результатом
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'."; // Правила игры
        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) { // Цикл присвоения случайных чисел и арифметической операции
            int randomNum = 1 + (int) (Math.random() * MAX_NUMBERS);
            result = (randomNum % 2 == 0) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[i][0] = String.valueOf(randomNum);
            data[i][1] = result;
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
