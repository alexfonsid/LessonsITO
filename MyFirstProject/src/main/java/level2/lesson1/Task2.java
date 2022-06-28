package level2.lesson1;

public class Task2 {
    //    Создать класс, в нём создать три своих метода: “идти налево”, “идти направо”, “идти прямо”,
//    каждый должен выводить на экран соответствующую информацию. Что выводить на экран берём
//    из сказки Змей Горыныча: Налево пойдёшь - богатым будешь, направо - женатым, а кто прямо пойдёт, тот к камню вернётся.
//    В main, вызвать методы “идтиПрямо” 2 раза и 1 раз вызвать любой другой свой метод.
    public static void main(String[] args) {
        goStraight();
        goStraight();
        goToRight();
    }

    static void goToLeft() {
        System.out.println("богатым будешь");
    }

    static void goToRight() {
        System.out.println("женатым будешь");
    }

    static void goStraight() {
        System.out.println("к камню вернёшься");
    }
}
