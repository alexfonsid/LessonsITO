package level3.lesson4;

// Создать интерфейсы «летать», «передвигаться» и «есть пищу». Создайте
// классы и добавьте интерфейсы к ним, классы: собака, утка, автомобиль и
// самолёт. Руководствуйтесь фантазией и здравым смыслом.
public class Task2 {
    public static void main(String[] args) {

    }
}

interface Fly {
    void fly();
}

interface Move {
    void move();
}

interface EatFood {
    void eat();
}

class Dog implements Move, EatFood {
    @Override
    public void move() {
        System.out.println("могу бегать.");
    }

    @Override
    public void eat() {
        System.out.println("ем, что найду.");
    }
}

class Auto implements Move {

    @Override
    public void move() {
        System.out.println("Едет по дороге.");
    }
}

class Duck implements EatFood, Fly, Move {

    @Override
    public void fly() {
        System.out.println("летаю по небу.");
    }

    @Override
    public void eat() {
        System.out.println("Ем всё подряд.");
    }

    @Override
    public void move() {

    }
}

class Airplane2 implements Fly {

    @Override
    public void fly() {
        System.out.println("Лечу по небу высоко.");
    }
}