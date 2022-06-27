package level4.lesson4.part2;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Hello from begin main");
        MyThread3 thread1 = new MyThread3();
        System.out.println(thread1.isDaemon());

        thread1.setDaemon(true);
        thread1.start();
        System.out.println("End main");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Begin thread X");
        for (int i = 0; true; i++) {
            System.out.println(i);
        }


    }
}