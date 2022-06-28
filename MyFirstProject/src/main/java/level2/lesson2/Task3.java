package level2.lesson2;

import java.util.Random;

public class Task3 {
    //    Создать массив размером 15, заполнить его случайными числами.
//    Затем вывести массив на экран. Запустить несколько раз и увидеть,
//    что каждый раз массив заполнен разными значениями.
    public static void main(String[] args) {
        Random generator = new Random();
        int[] arrayMy = new int[15];

        for (int i = 0; i < arrayMy.length; i++) {
            arrayMy[i] = generator.nextInt();
        }

        for (int currentNumb : arrayMy) {
            System.out.println(currentNumb);
        }
    }
}
