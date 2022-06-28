package level1.lesson4.path2;

public class Task1 {
    public static void main(String[] args) {
//        показать все числа от 1 до 100, которые делятся без остатка на 3 и на 5. В
//        выводе должны быть числа: 15, 30, 45, 60, 75, 90.

        for (int i = 1; i <= 100; i++) {
            boolean b = i % 3 == 0;
            boolean b1 = i % 5 == 0;
            if (b && b1) {
                System.out.println(i);
            }
        }
    }
}
