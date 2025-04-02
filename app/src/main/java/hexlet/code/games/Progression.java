package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void numberIsMissing() { // Метод поиска недостающего числа
        String[][] data = new String[3][2]; // Создаем массив для хранения вопросов и ответов
        String gameQuestion = "What number is missing in the progression?"; // Правила игры
        String question; // Переменная с вопросом
        String result; // Переменная с результатом
        for (int i = 0; i < 3; i++) {
            int initPosition = (int) (Math.random() * 20); // Стартовая позиция
            int hidePosition = (int) (Math.random() * 10); // Скрытое позиция
            int randomIncrement = (int) (1 + Math.random() * 10); // случайный число (шаг прогрессии)
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
