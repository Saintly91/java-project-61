package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_NUMBERS = 20;
    private static final String GAME_QUESTION = "What is the result of the expression?"; // Правила игры
    private static final String[] OPERATIONS = {"+", "-", "*"}; // Доступные операции калькулятора

    public static String arithmeticOperation(String[] operation) {
        int operations = Utils.getRandomNumbers(0, operation.length); // случайная арифм. операция
        return operation[operations];
    }

    public static void calculator() { // Метод калькулятора
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив для вопросов и ответов
        String question; // Переменная с вопросом
        int result = 0;
        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) { // Цикл присвоения случайных чисел и арифметической операции
            int operand1 = Utils.getRandomNumbers(1, MAX_NUMBERS); // первое случайное число
            int operand2 = Utils.getRandomNumbers(1, MAX_NUMBERS); // второе случайное число
            String operation = arithmeticOperation(OPERATIONS);
            question = operand1 + " " + operation + " " + operand2; // Вопрос

            switch (operation) { // Блок вычисления результата в зависимости от арифметической операции
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                default:
                    break;
            }

            // присваиваем вопросы и ответы в массив data
            data[i][0] = question;
            data[i][1] = String.valueOf(result);
        }
        Engine.gameEngine(data, GAME_QUESTION); // Вызываем метод "движка" игры
    }
}
