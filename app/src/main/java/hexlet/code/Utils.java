package hexlet.code;

public class Utils {
    public static int getRandomNumbers(int min, int max) { // Метод генерации случайного числа
        return (int) (Math.random() * (max - min) + min);
    }
}
