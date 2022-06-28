package level1.Examen;

public class Oborot {
//    Дано целое число N (> 0).
//    Используя операции деления нацело и взятия остатка от деления,
//    найти число, полученное при прочтении числа N  справа налево.
    public static void main(String[] args) {
        int N = 123456;
        int result = 0, c;
        int i = 0;
//        int num1, num2, num3, num4, num5;
//        num1 =  N % 10;
//        num2 =  (N % 100 - num1) / 10;
//        num3 =  (N % 1000 - num2 * 10) / 100;
//        num4 =  (N % 10000 - num3 * 100) / 1000;
//        num5 =  (N - (N % 10000)) / 10000;
////        + (N % 100) * 1000 +(N % 1000) * 100 +(N % 10000) * 10;
//        result = num1 * 10000 + num2 * 1000 + num3 * 100 + num4 * 10 + num5;
        for (; N > 0; i++) {
            c = N % 10;
            result = result * 10 + c;
            N = N / 10;
        }

        System.out.println(i);
        System.out.println(result);

    }
}
