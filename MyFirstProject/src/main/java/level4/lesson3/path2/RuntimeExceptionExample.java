package level4.lesson3.path2;

import java.io.FileNotFoundException;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        invokeMethodWithCheckEx();
    }

    private static void invokeMethodWithUnCheckEx() {
        throw new ArithmeticException();
    }

    private static void invokeMethodWithCheckEx() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Error - " + e);
        }
    }
}
