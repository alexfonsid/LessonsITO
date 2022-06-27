package level4.lesson4.part2;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException{
        Thread.State state = Thread.currentThread().getState();
        System.out.println(state);
        System.out.println("утро");
        Thread.sleep(1_000);
        System.out.println(state);
        System.out.println("день");

        Thread.sleep(1_000);
        System.out.println("вечер");
        Thread.sleep(1_000);
        System.out.println("ночь");

        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(state);
    }


}
