package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    private static final int MAX_POSITION = 20;
    private static final int MAX_HIDE_POSITION = 10;
    private static final int MAX_INCREMENT = 10;

    public static void numberIsMissing() { // Метод поиска недостающего числа
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив для хранения вопросов и ответов
        String gameQuestion = "What number is missing in the progression?"; // Правила игры
        String question; // Переменная с вопросом
        String result; // Переменная с результатом
        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) {
            int initPosition = (int) (Math.random() * MAX_POSITION); // Стартовая позиция
            int hidePosition = (int) (Math.random() * MAX_HIDE_POSITION); // Скрытое позиция
            int randomIncrement = (int) (1 + Math.random() * MAX_INCREMENT); // случайный число (шаг прогрессии)
            String[] progressionNumbers = new String[10]; // создаем массив из 10 чисел
            progressionNumbers[0] = String.valueOf(initPosition); // Назначаем стартовое число для нашей прогрессии

            // Цикл присвоения случайных чисел с учетом шага прогрессии
            for (int j = 1; j < progressionNumbers.length; j++) {
                progressionNumbers[j] = String.valueOf(Integer.parseInt(progressionNumbers[j - 1]) + randomIncrement);
            }
            result = progressionNumbers[hidePosition]; // Записываем результат скрытого числа
            progressionNumbers[hidePosition] = ".."; // Заменяем скрытое число на ".."
            question = Arrays.toString(progressionNumbers); // Вопрос
            question = question.replace("[", "").replace("]", "").replace(",", "").trim();
            // присваиваем вопросы и ответы в массив data
            data[i][0] = question;
            data[i][1] = String.valueOf(result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
