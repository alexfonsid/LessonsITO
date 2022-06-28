package level1.lesson3.path2;

public class TaskDay {
    public static void main(String[] args) {
//        з-чу на проверку строк, создать переменную day записать любое значение из: пн, вт, ср, чт, пт, выходной.
//        используя if else if вывести день недели, для пн - 1, для вт - 2, для выходной надпись “6й, либо 7й день недели”.
        String day = "пт";
        if ("пн".equals(day)) {
            System.out.println(1);
        } else  if ("вт".equals(day)) {
            System.out.println(2);
        } else  if ("ср".equals(day)) {
            System.out.println(3);
        } else  if ("чт".equals(day)) {
            System.out.println(4);
        } else  if ("пт".equals(day)) {
            System.out.println(5);
        } else  if ("выходной".equals(day)) {
            System.out.println("6й, либо 7й день недели");
        }
    }
}
