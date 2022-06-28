package level3.lesson6;

import java.util.HashMap;
import java.util.Map;

//Создать map с именем dictionary(словарь), одно слово на русском, 2ое это описание/определение.
public class Dictinary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("огонь", "Fire");
        dictionary.put("вода", "water");
        dictionary.put("воздух", "air");


        for (Map.Entry<String, String> pair : dictionary.entrySet()) {
            System.out.println(pair);
        }
    }

}
