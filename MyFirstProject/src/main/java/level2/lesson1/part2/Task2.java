package level2.lesson1.part2;

public class Task2 {
    /**
     *
     * @param args
     */
    //            2. Написать метод min, который
//            возвращает минимальное из 2 аргументов.
//            В этой з-че использовать вначале if else конструкцию, затем её
//            закомментировать и использовать конструкцию “тернарного оператора”.
    public static void main(String[] args) {
        System.out.println(Math.max(2, 10));
        System.out.println(Math.min(2, 10));
        System.out.println(Math.pow(2, 10));
        System.out.println(more2(6, 11));
    }

    public int more(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    static int more2(int a, int b) {
        return a < b ? a : b;
    }
}
