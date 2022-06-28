package level1.lesson3.homework;

public class Breakfast {
    //    создать программу, в ней 2 логических переменных “есть сковородка“, “есть
    //    яйца”. Если есть яйца и сковородка, то вывести “Готовим яичницу”. В конце
    //    программы должен быть вывод “Идём на работу.”.
    public static void main(String[] args) {
        boolean hasFryingPan = true;
        boolean hasEggs = false;
        if (hasFryingPan && hasEggs) {
            System.out.println("Готовим яичницу");
        }
        System.out.println("Идём на работу.");
    }
}
