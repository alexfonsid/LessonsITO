package level1.lesson4.path1;

public class ForExample2 {
    public static void main(String[] args) {
        int quantity = 50;
        for (int currentStep = 1;currentStep <= quantity; currentStep++) {
            System.out.println("Приседаю: " + currentStep);
            if (currentStep == 25) {
                break;
            }

        }
        System.out.println(quantity);
    }
}
