package level2.lesson1;

public class MethodWithReturn {
    public static void main(String[] args) {
        add(2, 3);
        System.out.println(add(2, 3));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static String myFullName(String name, String surname) {
        return name + surname;
    }

    static int findMax(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    static int findMax2(int x, int y) {
        int max;
        max = (x > y) ? x: y;
        return max;
//        return x > y ? x : y; - ternarnu
    }
}
