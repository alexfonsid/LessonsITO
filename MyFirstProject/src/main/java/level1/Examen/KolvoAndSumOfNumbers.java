package level1.Examen;

public class KolvoAndSumOfNumbers {
    public static void main(String[] args) {
        int N = 12345;
        int counter = 0;
        for (int i = 1; i < 1000000000; i *= 10) {
            if (N % i == N % (i * 10)) {
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);

        int sum = 0;
        int vrem;
        for (int i = 0; i < counter; i++) {
            vrem = N;
            sum += vrem % 10;
            N = (N - (vrem % 10)) / 10;
        }
        System.out.println(sum);
    }
}
