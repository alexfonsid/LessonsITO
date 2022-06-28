package level2.lesson3.path2;

import java.util.Arrays;
import java.util.Random;

// Создать массив размером 10, заполнить его случайными числами в диапазоне от 0 до 20.
// Затем в зависимости от чётности/нечётности индекса поменять значение у числа,
// если индекс четный до число поменять значение на отрицательное.
public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(20);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? -array[i] : array[i];
        }

        System.out.println(Arrays.toString(array));

    }
}
