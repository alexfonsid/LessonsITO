package level4.lesson8;

import level4.lesson8.model.City;
import level4.lesson8.model.Person;
import level4.lesson8.reposity.CityRepository;
import level4.lesson8.reposity.PersonRepository;
import org.hibernate.Session;

import java.util.List;

public class HibernateUsage {
    public static void main(String[] args) {
//        CityRepository cityRepository = new CityRepository();
//
//        cityRepository.add(new City("LA"));
//        cityRepository.add(new City("Brest"));
//        cityRepository.add(new City("Vitebsk"));
//        cityRepository.add(new City("Gomel"));
//        cityRepository.add(new City("New York"));

//        City city = cityRepository.get(7);
//        System.out.println(city);

//        cityRepository.update(new City(2, "Los Angeles"));

//        cityRepository.delete(new City(2));

//        List<City> all = cityRepository.getAll();
//        System.out.println(all);

//        List<City> cities = cityRepository.getAll();
//        System.out.println(cities);
//
//        PersonRepository personRepository = new PersonRepository();
//        personRepository.getAll();

        PersonRepository personRepository = new PersonRepository();
//        personRepository.add(new Person("Alex", 35, new City(5)));
//        personRepository.add(new Person("Ivan", 34, new City(1)));

//        Person person = personRepository.get(102);
//        System.out.println(person);

//        Person person = personRepository.get(1);
//        System.out.println(person);

//        personRepository.update(new Person(1,"Oleg", 25, new City(1)));

        List<Person> all = personRepository.getAll();
        System.out.println(all);
        personRepository.delete(new Person(2));
        all = personRepository.getAll();
        System.out.println(all);
    }
}
