package level3.lesson5.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.ensureCapacity(100);
        System.out.println(arrayList.size());
        arrayList.add(0, 11);
        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(89));

        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,5);
        List<Integer> arr2 = List.copyOf(arr);
        System.out.println(arr);
List<Integer> arr3 = Collections.<Integer>emptyList();
//arr3.add(11);
if (arr.add(11)) {
    System.out.println(arr.add(11));
}
else System.out.println("Error/.");
        System.out.println();

    }
}
