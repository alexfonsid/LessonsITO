package level1.lesson3.homework;

public class Jackpot {
    public static void main(String[] args) {
//        создать программу, со строковой переменной “комбинация”, в строку записать
//        от “000” до “777”. Если “комбинация” равняется строке “777”, вывести
//        “Поздравляем, у вас джекпот!”. В конце программы должен быть вывод “Играем
//        дальше”.
        String combination = "777";
        if ("777".equals(combination)) {
            System.out.println("Поздравляем, у вас джекпот!");
        }
        System.out.println("Играем дальше");
    }
}
