package level2.lesson3.path2;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println("Before " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After " + Arrays.toString(numbers));

    }
}
