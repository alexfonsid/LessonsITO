package level2.lesson2;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random generator = new Random();
//        int x = generator.nextInt(100);
//        int y = generator.nextInt(100);
//        System.out.println(x);
//        System.out.println(y);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(500);
        }

        for (int x: numbers) {
            System.out.println(x);
        }
    }

}
