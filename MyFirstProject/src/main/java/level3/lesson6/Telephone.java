package level3.lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Телефонный справочник. Создайте класс Человек, поля у него имя, фамилия, телефон,
// адрес, дата рождения. В методе main создайте HashMap, ключи будут строки в виде “Фамилия Имя”,
// а значения будут объекты класса Человек, добавьте несколько людей, положите их в map,
// выведите все значения на экран, затем удалите 1 пару из map и снова выведите.
public class Telephone {
    public static void main(String[] args) {
        Map<String, Person> directory = new HashMap<>();
        Person alex = new Person("Alex", "Ivanov", "123456", "Minsk", "01-01-1998");
        Person aleksey = new Person("Aleksey", "Petrov", "123457", "Mogilev", "01-01-1988");
        Person vitaliy = new Person("Vitaliy", "Sidorov", "123458", "Brest", "01-01-1994");
        Person ivan = new Person("Ivan", "Chikin", "123459", "Minsk", "01-01-1995");
        directory.put(alex.familyName + " " +alex.name, alex);
        directory.put(aleksey.familyName + " " + aleksey.name, aleksey);
        directory.put(vitaliy.familyName + " " + vitaliy.name, vitaliy);
        directory.put(ivan.familyName + " " + ivan.name, ivan);
        for (Map.Entry<String, Person> pair : directory.entrySet())

        System.out.println(directory);
        directory.remove("Ivanov Alex");
        System.out.println(directory);

    }
}

class Person {
    String name;
    String familyName;
    String telephone;
    String address;
    String dateOfBirth;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(familyName, person.familyName) && Objects.equals(telephone, person.telephone) && Objects.equals(address, person.address) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, telephone, address, dateOfBirth);
    }

    public Person(String name, String familyName, String telephone, String address, String dateOfBirth) {
        this.name = name;
        this.familyName = familyName;
        this.telephone = telephone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
}