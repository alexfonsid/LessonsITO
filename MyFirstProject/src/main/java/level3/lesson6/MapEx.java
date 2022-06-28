package level3.lesson6;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
//        put
//        get
//        remove
        Map<String, String > contacts = new HashMap<>();
        System.out.println(contacts.size());
        contacts.put("Alex", "+375-29-333-44-55");
        contacts.put("Vika", "+375-29-444-44-55");
        contacts.put("Alexa", "+375-29-555-44-55");
//        System.out.println(contacts.size());
////        get
//        System.out.println(contacts.get("Vika"));
////        remove
//        System.out.println(contacts.remove("Vika"));
////        System.out.println(contacts.get("Vika")); // null
//        contacts.put("Alex", "+7-921-333-44-55");
//        System.out.println(contacts);
        for (Map.Entry<String , String > pair : contacts.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(pair);

        }
    }

}
