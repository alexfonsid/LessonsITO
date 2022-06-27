package level4.lesson5;

public class FuncInterfEx2 {
    public static void main(String[] args) {
//        Checker checker1 = new IsMoreThanFifty();
//        Checker checker2 = new IsEven();

        Checker checker1 = (number) -> number > 50;     // Lambda
        Checker checker2 = (number) -> number % 2 == 0; // Лямбда

//        Лямбда - анонимная реализация функционального интерфейса
//        (args names) -> {
//           code
//        };

//        (args names) -> code;

        System.out.println(checker1.test(51));
        System.out.println(checker2.test(8));
    }
}

@FunctionalInterface
interface Checker {
    boolean test(int number);
}

//
//class  IsMoreThanFifty implements Checker {
//
//    @Override
//    public boolean test(int number) {
//        return number > 50;
//    }
//}
//
//class IsEven implements Checker {
//
//    @Override
//    public boolean test(int number) {
//        return number % 2 == 0;
//    }
//}
//