package level3.lesson6;

import java.util.HashMap;
import java.util.Map;

public class MapNumbers {
    public static void main(String[] args) {
        Map<String, String> numbers = new HashMap<>();
//        map.put
//        1. hashcode()
//        2. hash() - определяем номер "баккета" (ячейка массива)
//        3. Идёт проверка пустая ли ячейка
//          3.1 equals == true - замена,
//          3.2 equals == false - формируется linkedList

        numbers.put("0", "zerro");
//        1. hashcode = 48
        System.out.println("0".hashCode());
//        2.hash()
        System.out.println(48 % 16);
//        3. isEmpty?
        numbers.put("1", "one");
        numbers.put("2","two");
        numbers.put("3","three");
        numbers.put("11","eleven");
    }
}
