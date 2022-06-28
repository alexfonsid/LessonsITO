package level2.lesson3.path1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
//        Создать массив размером 15 с типом элементов String. Записать в
//        массив слова “чётный”, “нечётный” в зависимости от индекса, если индекс чётный, 
//        то должно быть слова st“чётный”. Вывести полученный результат на экран.
        String[] myArray = new String[15];
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                myArray[i] = "even";
            } else {
                myArray[i] = "odd";
            }
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));
    }
}
