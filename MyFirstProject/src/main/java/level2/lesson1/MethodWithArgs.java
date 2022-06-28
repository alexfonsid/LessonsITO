package level2.lesson1;

import level1.Examen.SumOfNumbers;

public class MethodWithArgs {
    public static void main(String[] args) {
        add(10, 20);
        add(15, 25);
        name("Sasha", 34);
        MethodDefinition.sayHello10Times();
    }

    static void add(int x, int y) {
        System.out.println(x + y);
    }

    static void name(String name, int age) {
        System.out.println("Hello!");
        System.out.println("My name is " + name + ". " + "I'm Java developer. " + "I'm " + age);
    }

    static void name(String name) {
        System.out.println("Hello!");
        System.out.println("My name is " + name + ". " + "I'm Java developer. " + "I'm cool");
    }
}
