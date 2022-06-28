package level2.lesson5.path2;

// Написать 3 метода, которые подсчитывают количество всех точек,
// запятых и восклицательных знаков в строке.
// Написать 3 метода, которые подсчитывают количество всех точек, запятых и
public class Task4 {
    public static void main(String[] args) {
        String example = "Написать 3 метода!!! Которые подсчитывают количество всех точек, запятых," +
                " восклицательных знаков в строке....";
        System.out.println(countDots(example));
        System.out.println(comms(example));
        System.out.println(exclamationPoint(example));
    }

    static int countDots(String example) {
        char[] chars = example.toCharArray();
        int index = 0;
        for (char x : chars) {
            if (x == '.') {
                index++;
            }
        }
        return index;
    }

    static int comms(String example) {
        char[] chars = example.toCharArray();
        int index = 0;
        for (char x : chars) {
            if (x == ',') {
                index++;
            }
        }
        return index;
    }

    static int exclamationPoint(String example) {
        char[] chars = example.toCharArray();
        int index = 0;
        for (char x : chars) {
            if (x == '!') {
                index++;
            }
        }
        return index;
    }
}
