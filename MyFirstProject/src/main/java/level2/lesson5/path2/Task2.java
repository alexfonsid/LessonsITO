package level2.lesson5.path2;

//Написать метод, принимающий в качестве параметров имя, фамилию и
// отчество и возвращающую инициалы в формате "Ф.И.О".
// Учесть, что входные параметры могут быть в любом регистре, а результирующая
// строка должна быть в верхнем.
public class Task2 {
    public static void main(String[] args) {
        String name = "alex", secName = "Evgen", familyName = "Sidorin";
        System.out.println(fio(name, secName, familyName));
    }

    static String fio(String name, String secName, String familyName) {
        String result = name.charAt(0) + "." + secName.charAt(0) + "." + familyName.charAt(0) + ".";
        return result.toUpperCase();
    }
}
