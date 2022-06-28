package level3.lesson5.dz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class IterableEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6);
//        arr.forEach(elem -> System.out.println(elem));
        System.out.println(arr);

        Iterator<Integer> iterator = arr.iterator();
//        if (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//        iterator.next();
//        iterator.remove();
//        System.out.println(arr);
        while (iterator.hasNext()) {
            System.out.print("\t" + iterator.next());
        }
        System.out.println();
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
