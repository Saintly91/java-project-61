package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Progression {
    private static final int MAX_POSITION = 20;
    private static final int MAX_HIDE_POSITION = 10;
    private static final int MAX_INCREMENT = 10;
    private static final int MAX_PROGRESSION_NUMBER = 10;
    private static final String GAME_QUESTION =
            "What number is missing in the progression?"; // Правила игры

    public static String[] generateProgression(int initPosition, int randomIncrement, int maxLength) {
        String[] progression = new String[maxLength]; // создаем массив из 10 чисел
        for (int i = 0; i < maxLength; i++) {
            progression[i] = String.valueOf(initPosition + i * randomIncrement); // Заполняем числа
        }
        return progression;
    }

    public static void numberIsMissing() { // Метод поиска недостающего числа
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем вопросов и ответов
        String question; // Переменная с вопросом
        String result; // Переменная с результатом
        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) {
            int initPosition = Utils.getRandomNumbers(1, MAX_POSITION);
            int randomIncrement = Utils.getRandomNumbers(1, MAX_INCREMENT);
            int hidePosition = Utils.getRandomNumbers(1, MAX_HIDE_POSITION); // Скрытое позиция
            String[] progressionNumbers =
                    generateProgression(initPosition, randomIncrement, MAX_PROGRESSION_NUMBER);
            result = progressionNumbers[hidePosition]; // Записываем результат скрытого числа
            progressionNumbers[hidePosition] = ".."; // Заменяем скрытое число на ".."
            question = Arrays.toString(progressionNumbers); // Вопрос
            question = question.replace("[", "").replace("]", "").replace(",", "").trim();
            // присваиваем вопросы и ответы в массив data
            data[i][0] = question;
            data[i][1] = String.valueOf(result);
        }
        Engine.gameEngine(data, GAME_QUESTION); // Вызываем метод "движка" игры
    }
}
