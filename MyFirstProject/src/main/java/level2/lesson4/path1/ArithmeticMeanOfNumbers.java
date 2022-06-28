package level2.lesson4.path1;

import java.util.Arrays;
import java.util.Random;

//Создать массив чисел размером 20, написать метод, который принимает массив и
// возвращает среднее арифметическое элементов массива.
public class ArithmeticMeanOfNumbers {
    public static void main(String[] args) {
        Random gen = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(arithmeticMeanOfNumbers(array));
    }

    static double arithmeticMeanOfNumbers(int[] array) {
        double sum = 0;
        for (int x : array) {
            sum += x;
        }
        return (sum / array.length);
    }
}
