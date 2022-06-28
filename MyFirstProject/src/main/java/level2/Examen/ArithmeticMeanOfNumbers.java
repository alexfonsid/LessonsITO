package level2.Examen;

import java.util.Arrays;
import java.util.Random;

public class ArithmeticMeanOfNumbers {
    public static void main(String[] args) {
        System.out.println(arithmeticMeanOfNumbers());
    }

    static double arithmeticMeanOfNumbers() {
        double sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        System.out.println(sum);
        return (sum / 9);
    }
}
