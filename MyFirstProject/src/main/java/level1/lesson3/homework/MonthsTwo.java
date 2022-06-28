package level1.lesson3.homework;

public class MonthsTwo {
    public static void main(String[] args) {

//        создать программу, с переменной “месяц” и значением от 1 до 12. Использовать
//        конструкцию “if else if”. Сделать проверку числа и вывести соответствующий
//        месяц, для 1 - январь, для 2 - февраль и так далее.

        byte month = 7;
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
        }
    }
}
