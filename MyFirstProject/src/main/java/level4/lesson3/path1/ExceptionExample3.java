package level4.lesson3.path1;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Angelina");
        names.add("Vera");
        names.add("Dima");

        System.out.println(names.get(10));
    }
}
