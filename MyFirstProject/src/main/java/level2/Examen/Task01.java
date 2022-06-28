package level2.Examen;

import java.util.Arrays;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] arrayMy = new int[5];
        for (int i = 0; i < arrayMy.length; i++) {
            arrayMy[i] = generator.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayMy));
        for (int i = arrayMy.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayMy[j] > arrayMy[j + 1]) {
                    int max = arrayMy[j];
                    arrayMy[j] = arrayMy[j + 1];
                    arrayMy[j + 1] = max;
                }
            }
        }
        System.out.println(Arrays.toString(arrayMy));
    }
}
