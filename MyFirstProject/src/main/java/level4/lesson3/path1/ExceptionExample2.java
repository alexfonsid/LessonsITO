package level4.lesson3.path1;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        sum(x, y);
        System.out.println(x / y);


    }

    private static void sum(int x, int y) {
        if (y == 0) {
            throw new RuntimeException("jopa s volosami");
        }
        System.out.println(x + y);
    }
}
