package level3.lesson3.path2;

public class OverloadingEx {
    static void hello() {
        System.out.println("Hello!");
    }

    static void hello(String name) {
        System.out.println("Hello! " + name);
    }

    public static void main(String[] args) {
        hello();
        hello("Alex");
    }
}
