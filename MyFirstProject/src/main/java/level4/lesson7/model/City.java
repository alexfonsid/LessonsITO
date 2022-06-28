package level4.lesson7.model;

public class City {
    public int id;
    public String name;

    public City() {
    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return '\n' + "City{" +
                '\t' + "id=" + id +
                '\t' + ", name='" + name +'\'' + "\t" +
                '}';
    }
}
