package level1.lesson3.path1;

public class IfElseExample {
    public static void main(String[] args) {
        boolean hasMomey = false;

        if (hasMomey) {
            System.out.println("Go restaurant");
        } else {
           System.out.println("Eating at home");
        }

        int age = 15;
        boolean isOurFriend = true;
        boolean isAdult = age >= 18;
        if (isAdult || isOurFriend) {
            System.out.println("Go club");
        } else {
            System.out.println("Go home");

        }


    }
}
