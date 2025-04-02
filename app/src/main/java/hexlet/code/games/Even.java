package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void parityCheck() {
        String[][] data = new String[3][2]; // Создаем массив для хранения вопросов и ответов
        String result; // Переменная с результатом
        String gameQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'."; // Правила игры
        for (int i = 0; i < 3; i++) { // Цикл присвоения случайных чисел и арифметической операции
            int randomNum = 1 + (int) (Math.random() * 100);
            result = (randomNum % 2 == 0) ? "yes" : "no";
            // присваиваем вопросы и ответы в массив data
            data[i][0] = String.valueOf(randomNum);
            data[i][1] = result;
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
