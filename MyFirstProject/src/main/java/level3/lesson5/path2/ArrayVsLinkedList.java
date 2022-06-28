package level3.lesson5.path2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedList {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> names = new LinkedList<>();
        for (int i = 0; i < 10_000; i++) {
            names.add("some" + i);

        }
        long end = System.currentTimeMillis();
        System.out.println("ArrList: " + (end - start));
    }
}
