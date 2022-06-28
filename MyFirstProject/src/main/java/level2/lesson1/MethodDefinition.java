package level2.lesson1;

public class MethodDefinition {
    public static void main(String[] args) {
        sayHello();
        System.out.println("<=><=><=><=>");
        sayHello10Times();
    }

    static void sayHello() {
        System.out.println("Hello!");
        System.out.println("I'm Sasha. I'm Java developer.");
    }

    static void sayHello10Times() {
        for (int i = 0; i < 10; i++) {
            sayHello();
        }

    }


}
