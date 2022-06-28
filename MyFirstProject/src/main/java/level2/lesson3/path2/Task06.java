package level2.lesson3.path2;

import java.util.Arrays;
import java.util.Random;

//Создать 2 массива размером 10 и 15, заполнить случайным значениями.
//            Создать метод, который на вход принимает оба массива, а возвращает новый массив,
//            который объединяет 1 и 2 массив. В методе main проверить работу метода.
public class Task06 {

    public static void main(String[] args) {
        Random gen = new Random();

        int[] array1 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = gen.nextInt(10);
        }

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = gen.nextInt(10);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(connectOfArrays(array1, array2)));
    }

    static int[] connectOfArrays(int[] array1, int[] array2) {
        int[] connectArray = new int[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            connectArray[i] = array1[i];
//
//        }
//        for (int i = array1.length; i < connectArray.length; i++) {
//            connectArray[i] = array2[i - array1.length];
//        }
        int index = 0;
        for (int i = 0; i < array1.length; i++, index++) {
            connectArray[index] = array1[i];
        }

        for (int i = 0; i < array2.length; i++, index++) {
            connectArray[index] = array2[i];
        }

        return connectArray;
    }
}
