package level1.lesson4.path2;

public class Task3 {
    //    Напишите программу, которая выводит на экран числа от 1 до 100.
//    При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
//    а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz».
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean a = i % 3 == 0;
            boolean b = i % 5 == 0;
            if (a && b) {
                System.out.println("FizzBuzz");
            } else if (a) {
                System.out.println("Fizz");
            } else if (b) {
                System.out.println("Buzz");
            } else
            System.out.println(i);
        }
    }
}
