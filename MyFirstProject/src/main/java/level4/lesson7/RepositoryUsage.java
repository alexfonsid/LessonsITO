package level4.lesson7;

import level4.lesson7.model.City;
import level4.lesson7.reposity.CityRepository;

import java.io.IOException;
import java.sql.SQLException;
public class RepositoryUsage {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        CityRepository repository = new CityRepository();
        City moscow = new City("Moscow");
        City brooklyn = new City(11, "Brooklyn");
        repository.update(brooklyn);
//        repository.create(moscow);


    }
}
