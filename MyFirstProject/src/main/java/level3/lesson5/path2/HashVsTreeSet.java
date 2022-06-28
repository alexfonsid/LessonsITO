package level3.lesson5.path2;

import java.util.HashSet;
import java.util.Set;

public class HashVsTreeSet {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Set<String> names = new HashSet<>();
        for (int i = 0; i < 10_000; i++) {
            names.add("name: " + i);
        }

        for (String n : names) {
            String currName = n;
            System.out.println(currName);
        }

        long end = System.currentTimeMillis();
        System.out.println("HashSet: " + (end - start));
    }
}
