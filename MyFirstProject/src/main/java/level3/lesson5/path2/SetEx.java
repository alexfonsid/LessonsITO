package level3.lesson5.path2;
import level3.lesson5.path2.ContainsEx;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Vika", 20));
        people.add(new Person("Anton", 20));
        people.add(new Person("Maks", 20));
        people.add(new Person("Vika", 20));
        System.out.println(people.size());
        System.out.println(people);

        for (Person pers: people
             ) {
            System.out.println(pers);

        }
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(4);
//        numbers.add(1);
//        numbers.add(1);
//        System.out.println(numbers);

    }
}
