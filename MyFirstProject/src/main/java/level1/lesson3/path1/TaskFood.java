package level1.lesson3.path1;

public class TaskFood {
    public static void main(String[] args) {
//        Написать программу, в которой 2 boolean переменных isHungry, hasFood,
//        использовать “if” и “&&”, если обе переменные true, то вывести “Завтракаем”.
//        В любом случае в конце программы должен быть вывод “Иду на работу”.
        boolean isHungry = true;
        boolean hasFood = true;
        if (isHungry && hasFood) {
            System.out.println("Завтракаем");
        }
        System.out.println("Иду на работу");
    }
}
