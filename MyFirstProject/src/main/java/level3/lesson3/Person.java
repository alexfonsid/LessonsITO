package level3.lesson3;

public class Person {
    public String name;
    private int salary;
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error.");
        }
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(salary);
    }

    public Person(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}


class PersonUsage {
    public static void main(String[] args) {
        Person fred = new Person("Freddy", 10_000, 19);
        System.out.println(fred.name);
        fred.printInfo();

        Person will = new Person("Willy", 15_000, 35);
        will.setAge(-20);
        System.out.println(will.getAge());
    }
}
