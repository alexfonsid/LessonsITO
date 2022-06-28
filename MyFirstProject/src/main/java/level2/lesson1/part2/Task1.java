package level2.lesson1.part2;

public class Task1 {
    //    Изменить прошлую з-чу, теперь метод “сложение”
//    должен возвращать результат, а не выводить его в консоль.
//    В методе main, записать результаты выводов в отдельные переменные и
//    эти переменные вывести в консоль.
//            ===============================
//            2. Написать метод min, который
//            возвращает минимальное из 2 аргументов.
//            В этой з-че использовать вначале if else конструкцию, затем её
//            закомментировать и использовать конструкцию “тернарного оператора”.
    public static void main(String[] args) {
        int one = sum(100, 500);
        int two = sum(4, 2);
        int three = sum(3, 5);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

    private static int sum(int a, int b) {
        return a + b;
    }


}
