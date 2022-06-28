package level3.lesson6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, String> translator = new HashMap<>();
        translator.put("yabl", "apple");
        translator.put("ananas", "pan-apple");
        translator.put("pomidor", "tomato");
        System.out.println(translator);

    }
}

