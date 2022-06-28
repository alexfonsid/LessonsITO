package level2.Examen;
// Написать метод, который получает 2 числа и возвращает разницу между ними.
//Например(2,7), разница 5, 2й пример(7,2), разница тоже 5. Метод возвращает
// только положительное число.
public class DifferenceBetweenNumbers {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 71;
        System.out.println(differenceBetweenNumbers(number1, number2));
    }

    static int differenceBetweenNumbers(int num1, int num2) {
        int diff = num1 - num2;
        diff = diff > 0 ? diff : -diff;
        return diff;
    }
}
