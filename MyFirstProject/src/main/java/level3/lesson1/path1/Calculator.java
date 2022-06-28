package level3.lesson1.path1;

public class Calculator {
    void sum(int x, int y) {
        System.out.println(x + y);
    }

    void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    void sumArr(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    void sumOfNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        calculator.sum(7,1, 2);
        int[] numbers = new int[] {1, 2, 7};
        calculator.sumArr(numbers);
        calculator.sumOfNumbers(1, 2, 7, 11);


    }
}
