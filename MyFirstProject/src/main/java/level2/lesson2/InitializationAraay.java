package level2.lesson2;

public class InitializationAraay {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = numbers.length; i > 0; i--) {
            numbers[i - 1] = 11 - i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

// for (type name: arrayName)
    }
}
