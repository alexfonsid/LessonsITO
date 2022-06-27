package level4.lesson4.part2;

public class ThreadExample5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begin of main");

        MyThread thread1 = new MyThread();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();

        System.out.println(thread1.isAlive());
        thread2.join();
        thread1.join();

        System.out.println("End of main");
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello - 1!");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello - 2!");
    }
}