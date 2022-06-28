package level2.lesson4.path2;

import java.util.Arrays;

//Написать метод, который принимает массив и два числа. Два числа это два индекса этого массива,
// метод должен поменять местами эл-ты по переданным индексам. В методе main у вас должен быть массив {5, 3, 2, 1, 4},
// в main вызывайте свой метод столько раз, пока массив не будет полностью отсортированным.
public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        int index1 = 0;
        int index2 = 3;
        System.out.println(Arrays.toString(array));
        changeArray(array, index1, index2);
        System.out.println(Arrays.toString(array));
        changeArray(array, 1, 2);
        System.out.println(Arrays.toString(array));
        changeArray(array, 3, 4);
        System.out.println(Arrays.toString(array));

    }

    static void changeArray(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
