package level2.lesson3.path1;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
//       Создать массив размером 20, заполнить случайными числами. Написать 2 метода,
//       которые принимают массив и 1 метод возвращает минимальное, 2 метод возвращает
//       максимальное число этого массива.
        int[] myArray = new int[20];
        Random generator = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = generator.nextInt(100);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println(minOfArray(myArray));
        System.out.println(maxOfArray(myArray));
    }

    static int minOfArray(int[] myArrayEx) {
        int min = myArrayEx[0];
        for (int x : myArrayEx) {
            if (x < min) {
                min = x;
            }
        }
        return min;

    }

    static int maxOfArray(int[] myArrayEx) {
        int max = myArrayEx[0];
        for (int x : myArrayEx) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}


