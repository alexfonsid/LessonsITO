package level2.lesson3.path2;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    //    Создать массив размером 15, написать метод, который принимает массив и возвращает сумму всех чисел этого массива.
    public static void main(String[] args) {
        int[] array = new int[5];
        Random gen = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(10);
        }

        int sumAll = sumArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(sumAll);
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }

}
