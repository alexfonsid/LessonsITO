package level2.lesson4.path1;
//Написать метод, который принимает массив и число,
// метод должен найти это число в массиве и вернуть его индекс, если такого числа нет,
// то метод должен вернуть -1.
public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        System.out.println(searchIndex(array, number));
    }

    static int searchIndex(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
