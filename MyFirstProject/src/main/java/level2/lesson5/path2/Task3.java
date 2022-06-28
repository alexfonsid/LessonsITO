package level2.lesson5.path2;

//Дана строка “1, 25, 32, 100, 15, 7”. Написать 2 метода, которые принимают в качестве аргумента строку.
// 1й метод возвращает минимальное число из этой строки, а
// 2й метод возвращает сумму чисел в этой строке.
public class Task3 {
    public static void main(String[] args) {
        String numbers = "1, 25, 32, 100, 15, 7";
        String numbers2 = "1, 2, 3, 5, 7";

        System.out.println(setMin(numbers));
        System.out.println(setSum(numbers2));
    }

    static int setMin(String numbers) {
        String[] chars = numbers.split(", ");
        int min = Integer.parseInt(chars[0]);
        for (int i = 0; i < chars.length; i++) {
            int x = Integer.parseInt(chars[i]);
            if (x < min)
                min = x;
        }
        return min;
    }

    static int setSum(String numbers) {
        String[] chars = numbers.split(", ");
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            int x = Integer.parseInt(chars[i]);
            sum += x;
        }
        return sum;
    }
}
