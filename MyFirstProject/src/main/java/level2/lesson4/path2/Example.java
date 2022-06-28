package level2.lesson4.path2;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] numbers = new  int[10];
        String[] names = new String[10];

        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[5];
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));

        int[][] array2 = {{1,2,3},{4,5,6,7,8}};
        System.out.println(Arrays.deepToString(array2));

        int[][] array3 = new int[3][5];
        System.out.println(Arrays.deepToString(array3));
    }
}
