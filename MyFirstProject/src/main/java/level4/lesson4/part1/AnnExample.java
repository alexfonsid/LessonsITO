package level4.lesson4.part1;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited()
public @interface AnnExample {
}

class Person {
    int age;
    @AnnExample
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void sayHi() {
        System.out.println("Hi!");
    }
}
