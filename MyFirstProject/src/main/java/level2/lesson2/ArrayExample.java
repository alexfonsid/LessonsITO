package level2.lesson2;

public class ArrayExample {
//     type[] name = new type[length];

//    - Массив на 10 элементов типа short с именем ages.
//            - Массив на 100500 элементов типа String c именем surnames.
//            - Массив на 40 элементов типа float с именем prices.

    static void my1() {
        short[] ages = new short[10]; // 0
        String[] surnames = new String[100500]; // null
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }

    public static void main(String[] args) {
        int[] ages = new int[15];
        int[] numbers = new int[15];
        String[] names = new String[100];
        my1();

        int length = numbers.length;
        System.out.println(length);
    }
}
