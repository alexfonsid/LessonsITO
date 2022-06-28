package level3.lesson6;

import java.util.HashMap;
import java.util.Map;

public class MapIntEx {
    public static void main(String[] args) {
        Map<Integer, String> deals = new HashMap<>();
        deals.put(1, "Проснуться");
        deals.put(2, "Умыться");
        deals.put(3, "Помыться");
        deals.put(4, "Потрудиться");
        deals.put(5, "Лечь спать");

        System.out.println(deals);
        System.out.println(deals.get(Integer.valueOf(3)));

    }
}
