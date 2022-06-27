package level4.lesson8.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class Person {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public int age;

    @ManyToOne
    public City city;

    public Person(int id, String name, int age, City city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
