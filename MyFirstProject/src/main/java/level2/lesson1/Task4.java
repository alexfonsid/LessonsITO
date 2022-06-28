package level2.lesson1;

public class Task4 {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Victoria";
        int age = 33;
        hello("Victoria", 33);
        hello(name, age);
        hello(name, age);
        hello(name, age);
    }

}
