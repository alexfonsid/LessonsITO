package level2.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] ages = new int[10];
        System.out.println(Arrays.toString(ages));

        ages[4] = 27;
        ages[5] = 24;
        ages[6] = 27;
        ages[7] = 22;
        ages[8] = 23;
        System.out.println(ages[6]);
        System.out.println(Arrays.toString(ages));
    }
}
