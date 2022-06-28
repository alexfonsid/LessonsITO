package level1.lesson3.homework;

public class Months {
    public static void main(String[] args) {
//        создать программу, с переменной “месяц” и значением от 1 до 12. Использовать
//        конструкцию “if else if”. Сделать проверку числа и вывести соответствующий
//        месяц, для 1 - январь, для 2 - февраль и так далее.
        byte month = 5;
        if (month == 1) {
            System.out.println("январь");
        } else if (month == 2) {
            System.out.println("февраль");
        } else if (month == 3) {
            System.out.println("март");
        } else if (month == 4) {
            System.out.println("апрель");
        } else if (month == 5) {
            System.out.println("май");
        } else if (month == 6) {
            System.out.println("июнь");
        } else if (month == 7) {
            System.out.println("июль");
        } else if (month == 8) {
            System.out.println("август");
        } else if (month == 9) {
            System.out.println("сентябрь");
        } else if (month == 10) {
            System.out.println("октябрь");
        } else if (month == 11) {
            System.out.println("ноябрь");
        } else if (month == 12) {
            System.out.println("декабрь");
        }
    }
}
