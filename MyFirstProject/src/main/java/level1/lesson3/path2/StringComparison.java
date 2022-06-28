package level1.lesson3.path2;

public class StringComparison {
    public static void main(String[] args) {
//        String name1 = "Ivan";
//        Создать программу, где если строка "2*2" выводим 4, если строка "5*5" вывести 25, иначе вывести "я тебя не понимаю."
//        String name2 = "Ivan";
//        System.out.println(name1.equals(name2));

//        String phrase = "Hello";
//        if ("Hello".equals(phrase)) {
//            System.out.println("And you Hello");
//        } else if ("Bay".equals(phrase)) {
//            System.out.println("And you Bay");
//        } else {
//            System.out.println("I don't understand");
//        }

        String phrase = "5*5";
        if ("2*2".equals(phrase)) {
            System.out.println(4);
        } else if ("5*5".equals(phrase)) {
            System.out.println(25);
        } else {
            System.out.println("я тебя не понимаю.");
        }
    }
}
