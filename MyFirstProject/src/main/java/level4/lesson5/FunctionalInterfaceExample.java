package level4.lesson5;

public class FunctionalInterfaceExample {

}

@FunctionalInterface // не обязательная аннотация, но лучше ставить
interface MyInterface {
    void sayHi();

    default void sayHi2() {
    }

    private void sayHi3() {
    }
}

interface MyFunctionalInterface {
    void sayHi(String name);

}
class FunctionalClass implements MyFunctionalInterface {

    @Override
    public void sayHi(String name) {
        System.out.println("Hello " + name);
    }
}

class FuncInterfUssage {
    public static void main(String[] args) {
        MyFunctionalInterface my = new FunctionalClass();
        my.sayHi("Pert");

    }
}