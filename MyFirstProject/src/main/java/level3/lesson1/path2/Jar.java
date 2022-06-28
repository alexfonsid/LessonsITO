package level3.lesson1.path2;

public class Jar {
    int fullness;

    Jar(int fullness) {
        this.fullness = fullness;
    }

    void pour(Jar anotherJar) {
        this.fullness += anotherJar.fullness;
        anotherJar.fullness = 0;

    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);

        System.out.println(first.fullness + " "  + second.fullness);
        first.pour(second);
        System.out.println(first.fullness + " " + second.fullness);
    }
}
