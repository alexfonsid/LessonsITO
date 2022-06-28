package level1.Examen;

public class SumOfNumbers {
//    Даны два целых числа A и B (A < B).
//    Найти сумму всех целых чисел от A до B включительно.

    public static void main(String[] args) {
        int A = 1;
        int B = 5;
        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += i;
        }
//        System.out.println(sum);
    }
}
