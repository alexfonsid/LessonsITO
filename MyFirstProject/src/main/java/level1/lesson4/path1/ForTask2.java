package level1.lesson4.path1;

public class ForTask2 {
    public static void main(String[] args) {
//        Создать цикл от 10 до 1_000, но с условиями, если число меньше 100, то продолжить цикл не выполняя
//        оставшуюся часть тела цикла, если число больше 150, то выйти(прервать) из цикла,
//        в конце теле цикла выводить текущий счётчик.
        for (int i = 10; i <= 1000; i++) {
            if (i < 100) {
//                System.out.println(i);
                continue;
            } else if (i > 150) {
//                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
