package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int MAX_NUMBERS = 20;

    public static void calculator() { // Метод калькулятора
        String[][] data = new String[Engine.MAX_ROWS][Engine.MAX_COLUMNS]; // Создаем массив для вопросов и ответов
        String[] operations = {"+", "-", "*"}; // Доступные операции калькулятора
        String gameQuestion = "What is the result of the expression?"; // Правила игры
        String question; // Переменная с вопросом
        int result = 0; // Переменная с результатом
        for (int i = 0; i < Engine.MAX_ATTEMPTS; i++) { // Цикл присвоения случайных чисел и арифметической операции
            int operand1 = 1 + (int) (Math.random() * MAX_NUMBERS); // первое случайное число
            int operand2 = 1 + (int) (Math.random() * MAX_NUMBERS); // второе случайное число
            String operation = operations[(int) (Math.random() * operations.length)]; // случайная арифм. операция
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
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
