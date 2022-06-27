package level4.lesson4.part3;

import java.util.Map;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        thread.sleep(3000);
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println("End of main");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; true; i++) {
            System.out.println(i);
        }

    }
}

class MyResource {

}