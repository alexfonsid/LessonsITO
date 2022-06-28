package level2.lesson5.path1;

import java.util.Arrays;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {
    /*    String day = "Day";
        String and = new String("and");
        String night = "night";
//        concatenation

        String dayAndNight = day + " " + and + " " + night;
        String dayAndNight2 = day.concat(" ").concat(" ").concat(night);
        System.out.println(dayAndNight);
        System.out.println(day + " " + and + " " + night);
        System.out.println(dayAndNight2);

        String name = "Marina";
        String name2 = "mariNa";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        int age = 18;

        String strAge = "" + age;
        String strAge2 = String.valueOf(age);

        String x = "10";
        String y = "20";

        int xFromString = Integer.parseInt(x);
        int yFromString = Integer.parseInt(y);
        System.out.println(xFromString + yFromString); */

    /*    String name = "Marina";
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        char[] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String booleanStr = "true";
        boolean b = Boolean.parseBoolean(booleanStr); */

        String file = "10; 20; 3; 7; 14; 17";
        String[] strings = file.split("; ");
        System.out.println(Arrays.toString(strings));

        String file2 = "10-20-3-7-14-17";
        String[] strings2 = file.split("-");
        System.out.println(Arrays.toString(strings));
    }
}
