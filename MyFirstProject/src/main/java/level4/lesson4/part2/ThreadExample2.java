package level4.lesson4.part2;

import org.w3c.dom.ls.LSOutput;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
Task task = new Task();
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

        Thread.sleep(1_000);
        System.out.println(thread.getState());
        System.out.println(thread.getName());

    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from second thread!!");
    }
}
