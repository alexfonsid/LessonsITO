package level2.lesson4.path1;

import java.util.Arrays;
import java.util.Scanner;

// Необходимо создать программу, которая будет заполнять массив числами, возведенными в квадрат.
// В методе передаётся параметр bound. Он определяет, до какого  числа нужно записывать числа.
// Например, если задается bound = 3, нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
public class Task4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int bound = read.nextInt();
        System.out.println("Массив из квадратов чисел: ");
        System.out.println(Arrays.toString(square(bound)));
    }

    static int[] square(int bound) {
        int[] array = new int[bound];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        return array;
    }
}
