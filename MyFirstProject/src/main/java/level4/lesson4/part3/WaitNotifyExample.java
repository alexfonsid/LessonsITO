package level4.lesson4.part3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotifyExample {
    public static void main(String[] args) {
//        Object
        System.out.println();
        Store store = new Store();
        Producer producer = new Producer(store);
//        Consumer consumer = new Consumer(store);

        producer.start();
//        consumer.start();

//        deadlock = взаимная блокировка

    }
}

class Store {
    int product;

    Lock lock = new ReentrantLock();
    Condition buyCondition = lock.newCondition();
    Condition sellCondition = lock.newCondition();


    void sell() {
        System.out.println("store sell");
        product--;
        System.out.println("number of products: " + product);
    }

    synchronized void buy() throws InterruptedException {
        while (product >= 3)
        System.out.println("store buy");
        product++;
        System.out.println("number of products: " + product);
    }
}

class Producer extends Thread {
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            store.buy();
        }
    }

}

class Consumer extends Thread {

    @Override
    public void run() {
        super.run();
    }

}