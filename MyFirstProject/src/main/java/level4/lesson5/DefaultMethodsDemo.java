package level4.lesson5;

public class DefaultMethodsDemo {
    public static void main(String[] args) {
        Hi myClass1 = new MyClass1();
        Hi myClass2 = new MyClass2();
        myClass1.sayHello();
        myClass2.sayHello();
    }
}

interface Hi {
    default void sayHello() {
        System.out.println("Hi!");
    }

    private void calculate() {

    }
}

interface Hi2 {
    default void sayHello() {
        System.out.println("Hi!");
    }
}

class MyClass1 implements Hi {

}

class MyClass2 implements Hi, Hi2 {
    @Override
    public void sayHello() {
        Hi2.super.sayHello();
    }
}