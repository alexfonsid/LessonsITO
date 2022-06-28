package level2.lesson5.path2;

import javax.sound.midi.Soundbank;

public class ExamplePath2 {
    public static void main(String[] args) {
//        indexOf
        String name = "Ivan";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
// substring

        String phrase = "Hello, my name is Alex";
        System.out.println(phrase.substring(6));
        System.out.println(phrase.substring(14, 20));

        String string = "";
        String string2 = "   a         ";
        String string3 = "         ";
        System.out.println(string.isEmpty());
        System.out.println(string2.isEmpty());
        System.out.println(string3.isEmpty());

//        trim
        String string4 = "    A    le   a             ";
        System.out.println(string4.trim());

//        replace
        String string5 = "Hello, my name is Alex! Hello, hello";
        System.out.println(string5.replace("Hello", "OK"));
// startWith / endWith
        String string6 = "Котёнок";
        System.out.println(string6.startsWith("Кот"));
        System.out.println(string6.endsWith("н"));
//        contains
        System.out.println(string6.contains("Кот"));
        System.out.println(string6.contains("тён"));
        System.out.println(string6.contains("ок"));

//        repeat
        String string7 = "abc";
        System.out.println(string7.repeat(5));


    }
}
