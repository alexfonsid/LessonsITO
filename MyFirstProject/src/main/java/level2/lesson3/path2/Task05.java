package level2.lesson3.path2;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    //    Создать массив, размером 30 со случайными значениями чисел.
//    Заменить каждый элемент массива с нечетным индексом на ноль.
    public static void main(String[] args) {
        int[] array = new int[30];
        Random gen = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 != 0 ? 0 : array[i];
        }

        System.out.println(Arrays.toString(array));

    }
}
