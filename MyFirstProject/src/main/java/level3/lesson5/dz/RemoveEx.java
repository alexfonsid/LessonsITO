package level3.lesson5.dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1,2,3,4,5,6,7,8);
        System.out.println(arrayList);
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.remove(Integer.valueOf(2)));
        System.out.println(arrayList);
//        arrayList.clear();
        System.out.println(arrayList.lastIndexOf(3));
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, 1,4);
        System.out.println("\t" + arrayList.containsAll(arrayList2));
arrayList.replaceAll(elem -> elem * 2);
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList);
    }
}
