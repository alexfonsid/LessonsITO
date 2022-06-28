package level2.lesson5.path1;

import java.util.Locale;

//Написать метод, который принимает строку и индекс. Метод печатает
// на экран текст вида: “Символ на позиции 0 это П”,
// либо “Символ на позиции 3 это В”. Пример выше для слова “Привет” и
// переданными индексами 0 и 3 соответственно.
public class Task01 {
    public static void main(String[] args) {
        String strings = "Символ на позиции 3 это В";
        int index = 3;
        printSymbol(strings, index);
        strings = "Привет";
        printSymbol2(strings, 0);
        printSymbol2(strings, 3);

    }

    static void printSymbol(String strings, int index) {
        char[] str = strings.toCharArray();
        System.out.println("Символ на позиции " + index + " это " + Character.toUpperCase(str[index]));

    }

    static void printSymbol2(String strings, int index) {
        System.out.println("Символ на позиции " + index + " это " + strings.toUpperCase().charAt(index));

    }
}
