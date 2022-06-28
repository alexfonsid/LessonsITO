package level3.lesson3.path2;

public class Person {
    void earnMoney() {
        System.out.println("Hard work!");
    }
}

class Child extends Person {

    @Override
    void earnMoney() {
        System.out.println("Give me the money!");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.earnMoney();
        new Person().earnMoney();
    }
}