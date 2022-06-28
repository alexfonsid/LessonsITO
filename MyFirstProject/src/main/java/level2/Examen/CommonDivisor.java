package level2.Examen;

// Написать метод, который принимает 2 числа
// и возвращает наибольший общий делитель для обоих чисел.
public class CommonDivisor {
    public static void main(String[] args) {
        int number1 = 45;
        int number2 = 18;
        System.out.println(euclidAlgorithm(number1, number2));
        System.out.println(calculateGCD(number1, number2));
    }

    static int euclidAlgorithm(int number1, int number2) {
        int nod = 1;
        int tmp = 0;
        do {
            if (number1 > number2) {
                tmp = number1 % number2;
                nod = number2;
                number1 = number2;
                number2 = tmp;
            } else {
                tmp = number2 % number1;
                nod = number1;
                number2 = number1;
                number1 = tmp;
            }
        } while (tmp != 0);
        return nod;
    }

    static int calculateGCD(int firstNumber, int secondNumber) {
        int gcd = 1;
        int min = Math.min(firstNumber, secondNumber);
        for (int i = min; i > 1; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
                break;
            }

        }
        return gcd;
    }
}
