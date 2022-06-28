package level3.lesson1.path2;
import level3.lesson1.path2.Box;

public class LinkExample {
    public static void main(String[] args) {
//        primitives (8 types) & object / link
        int x = 10;
        int y = x;
        System.out.println(x + " " + y);
        x = 11;
        System.out.println(x + " " + y);
        System.out.println("=".repeat(10));

        Box box1 = new Box();
        box1.value = 10;

        Box box2 = box1;

        System.out.println(box1.value + " " + box2.value);
        box1.value = 11;
        System.out.println(box1.value + " " + box2.value);
    }
}
