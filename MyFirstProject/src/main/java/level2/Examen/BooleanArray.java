package level2.Examen;

import java.util.Arrays;
import java.util.Random;

// Создать метод, который принимает boolean массив и проверяет,
// что массив однородной, т.е. в нём все эл-ты это только true,
//либо только false. Метод возвращает true, если массив однородный,
// в противоположном случае false.
public class BooleanArray {
    public static void main(String[] args) {
        boolean[] myArray = new boolean[5];
        Random generator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            int x = generator.nextInt(2);
            System.out.print(x + " ");
            if (x == 0) {
                myArray[i] = false;
            } else {
                myArray[i] = true;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));
        System.out.println(checkArray(myArray));
    }

    static boolean checkArray(boolean[] array) {
        boolean check = array[0];
        int index = 0;
        for (boolean x : array) {
            if (x != check) {
                check = false;
                break;
            }
            index++;
        }
        return check = index == array.length ? true : false;
    }
}
