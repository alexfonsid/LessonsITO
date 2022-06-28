package level1.lesson3.path1;

public class ComplexIf {
    public static void main(String[] args) {
        int averageSalary = 1_500;
        int salary = 1000;

        if (salary > averageSalary) {
            System.out.println("More than average");

        } else if (salary < averageSalary) {
            System.out.println("Less than average");
        } else
            System.out.println("Our zp average");

        int number = 3;
        if (number == 1) {
            System.out.println("one");
        } else  if (number == 2) {
            System.out.println("Two");
        } else  if (number == 3) {
            System.out.println("Three");
        } else  if (number == 4) {
            System.out.println("Four");
        }
    }

}
