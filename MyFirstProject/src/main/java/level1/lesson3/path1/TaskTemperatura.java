package level1.lesson3.path1;

public class TaskTemperatura {
    public static void main(String[] args) {
        byte temperatura = -30;
        boolean isCold = temperatura < 15;
        if (isCold) {
            System.out.println("Одеваю пальто.");
        }

        System.out.println("Иду гулять.");
    }
}
