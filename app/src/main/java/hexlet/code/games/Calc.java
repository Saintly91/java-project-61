package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calculator() { // Метод калькулятора
        String[][] data = new String[2][3]; // Создаем массив для хранения вопросов и ответов
        String[] operations = {"+", "-", "*"}; // Доступные операции калькулятора
        String gameQuestion = "What is the result of the expression?"; // Правила игры
        String question; // Переменная с вопросом
        int result = 0; // Переменная с результатом
        for (int i = 0; i < 3; i++) { // Цикл присвоения случайных чисел и арифметической операции
            int operand1 = 1 + (int) (Math.random() * 20); // первое случайное число
            int operand2 = 1 + (int) (Math.random() * 20); // второе случайное число
            String operation = operations[(int) (Math.random() * operations.length)]; // случайная арифметическая операция
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
            }
            // присваиваем вопросы и ответы в массив data
            data[0][i] = question;
            data[1][i] = String.valueOf(result);
        }
        Engine.gameEngine(data, gameQuestion); // Вызываем метод "движка" игры
    }
}
