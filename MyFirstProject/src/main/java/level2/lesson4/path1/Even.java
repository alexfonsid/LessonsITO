package level2.lesson4.path1;

import java.util.Arrays;
import java.util.Random;

// Создать массив чисел размером 25, создать метод,
// который принимает массив и возвращает массив из четных элементов первого массива.
public class Even {
    public static void main(String[] args) {
        Random gen = new Random();
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(evenArray(array)));
    }

    static int[] evenArray(int[] array) {
        int evenQuantity = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenQuantity++;
            }
        }

        int[] evenAr = new int[evenQuantity];
        int j = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                evenAr[j] = number;
                j++;
            }
        }
        return evenAr;
    }
}
