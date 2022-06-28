package level2.Examen;

// Написать метод, который принимает 2 строковых аргумента.
// Метод должен вернуть сколько раз встречается
// 1 аргумент во 2 аргументе.
public class SameWord {
    public static void main(String[] args) {
        String string1 = "wer";
        String string2 = "werwerwewerwer werwr";
        System.out.println(howMuch(string1, string2));
        System.out.println(countMatch(string1, string2));
    }

    static int howMuch(String arg1, String arg2) {
        int counter = 0;
        for (int i = 0; i <= (arg2.length() - arg1.length()); i++) {
            String word = arg2.substring(i, arg1.length() + i);
            if (arg1.equals(word)) {
                counter++;
            }
        }
        return counter;
    }

    static int countMatch(String substring, String string) {
        int quantity = 0;
//        if (string.endsWith(substring) || string.startsWith(substring)) {
//            quantity = string.split(substring).length + 1;
//        } else {
//            quantity = string.split(substring).length;
//        }
        int currentIndex = 0;
        while (currentIndex >= 0) {
            currentIndex = string.indexOf(substring, currentIndex + 1);
            quantity++;
        }
        return quantity;
    }
}
