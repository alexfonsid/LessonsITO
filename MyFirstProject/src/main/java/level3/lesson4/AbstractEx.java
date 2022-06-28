package level3.lesson4;

public class AbstractEx {
//    no obj, no instances

    public static void main(String[] args) {
//        Transport bus1 = new Bus();
//        Transport bus2 = new Bus();
//        Transport airplane = new Airplane();
//        Transport train = new Train();
        Transport[] transports = {new Bus(100, 40, 150_000),
                new Bus(20, 70, 250_000),
                new Airplane(100, 1000, 105000),
                new Train(500, 1000, 1000)};
        for (Transport tr: transports
             ) {
            tr.printInfo();
            tr.move();
            System.out.println();
        }
    }
}

abstract class Transport {
    int passengerQuantity;

    public Transport(int passengerQuantity, int averageSpeed, int cost) {
        this.passengerQuantity = passengerQuantity;
        this.averageSpeed = averageSpeed;
        this.cost = cost;
    }

    int averageSpeed;
    int cost;

    abstract void move();

    void printInfo() {
        System.out.println(passengerQuantity);
        System.out.println(averageSpeed);
        System.out.println(cost);
    }
}

class Bus extends Transport {
    public Bus(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    void move() {
        System.out.println("Еду по дороге, осттанавл на остановках.");
    }
}

class Airplane extends Transport {
    public Airplane(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Fly");
    }
}

class Car extends Transport {
    public Car(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Еду по дороге");
    }
}

class Train extends Transport {
    public Train(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Еду по рельсам");
    }
}