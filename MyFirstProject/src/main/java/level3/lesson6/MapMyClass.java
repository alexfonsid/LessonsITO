package level3.lesson6;

import java.util.*;

public class MapMyClass {
    public static void main(String[] args) {
        Map<String, Citizen> citizen = new HashMap<>();
        Citizen john = new Citizen("John", "Depp", 3, "AB123");
        citizen.put(john.passportNumber, john);

        System.out.println(citizen.toString());
        System.out.println(citizen.get("AB123"));
    }
}

class Citizen {
    String name;
    String familyName;
    int childrenQuantity;
    String passportNumber;

    public Citizen(String name, String familyName, int childrenQuantity, String passportNumber) {
        this.name = name;
        this.familyName = familyName;
        this.childrenQuantity = childrenQuantity;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", childrenQuantity=" + childrenQuantity +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

    public Citizen() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return childrenQuantity == citizen.childrenQuantity && Objects.equals(name, citizen.name) && Objects.equals(familyName, citizen.familyName) && Objects.equals(passportNumber, citizen.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, childrenQuantity, passportNumber);
    }
}
