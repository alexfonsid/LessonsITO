package level4.lesson8;

import level4.lesson8.model.City;
import level4.lesson8.reposity.CityRepository;
import level4.lesson8.reposity.PersonRepository;
import org.hibernate.Session;

import java.util.List;

public class HibernateUsage {
    public static void main(String[] args) {
        CityRepository cityRepository = new CityRepository();
//        cityRepository.add(new City("LA"));
//        cityRepository.add(new City("Brest"));
//        cityRepository.add(new City("Vitebsk"));
//        cityRepository.add(new City("Gomel"));
//        cityRepository.add(new City("New York"));


        List<City> cities = cityRepository.getAll();
        System.out.println(cities);

        PersonRepository personRepository = new PersonRepository();
        personRepository.getAll();
    }
}
