package level3.lesson5.path1;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        List<String> names = new ArrayList<>();
//        add()
//        set()
//        remove()
//        get()

        names.add("Andrey");
        names.add("Ivan");
        names.add("Petr");
        names.add("Ilya");
        names.add("Olga");
        System.out.println(names);

        names.set(1, "Alex");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        System.out.println(names.get(1));

        List<Person> people = new ArrayList<>();
        Person margarita = new Person("Margarita", 28);
        people.add(margarita);
        System.out.println(people);
// Generics
//        женерики обобщенные типы данных
        List<Integer> numbersTwo = new ArrayList<>();
        numbersTwo.add(10);
        numbersTwo.add(7);
        numbersTwo.add(15);
        numbersTwo.add(3);
        System.out.println(numbersTwo);

        for (int i = 0; i < numbersTwo.size(); i++) {
            Integer currentNumber = numbersTwo.get(i);
            System.out.println(currentNumber);
        }

        System.out.println("=".repeat(20));

        for (Integer currNum : numbersTwo) {
            System.out.println(currNum);
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}