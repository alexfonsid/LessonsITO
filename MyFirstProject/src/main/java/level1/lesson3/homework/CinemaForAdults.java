package level1.lesson3.homework;

public class CinemaForAdults {
    public static void main(String[] args) {
//        создать программу, с переменной “возраст” и значением от 0 до 100. Сделать
//        проверку age, если возраст от 18, то вывести на экран “Приятного просмотра”,
//        иначе вывести “Извини, не пропустим”.
        byte age = 34;
        if (age >= 18) {
            System.out.println("Приятного просмотра");
        } else {
            System.out.println("Извини, не пропустим");
        }
    }
}
