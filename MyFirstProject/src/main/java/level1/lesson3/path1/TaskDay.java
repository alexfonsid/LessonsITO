package level1.lesson3.path1;

public class TaskDay {
    public static void main(String[] args) {
        byte day = 7;
        if (day == 1) {
            System.out.println("понедельник");
        } else  if (day == 2) {
            System.out.println("вторник");
        } else  if (day == 3) {
            System.out.println("среда");
        } else  if (day == 4) {
            System.out.println("четверг");
        } else  if (day == 5) {
            System.out.println("пятница");
        } else  if (day == 6 || day == 7) {
            System.out.println("выходной");
        } else {
            System.out.println("какое-то другое число");
        }
    }
}
