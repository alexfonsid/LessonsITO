package level2.Examen;
// Написать метод, который возвращает сумму чисел от 1 до 5.
public class FromOneToFive {
    public static void main(String[] args) {
        System.out.println(summFromOneToFive());
    }

    static int summFromOneToFive() {
        int summ = 0;
        for (int i = 1; i <= 5; i++) {
            summ += i;
        }
        return summ;
    }
}
