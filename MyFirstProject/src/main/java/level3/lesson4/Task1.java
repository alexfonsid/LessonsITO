package level3.lesson4;
//создайте абстрактный класс Product, от него наследуйте 3 любых любимых вида реальных продуктов,
// например: Яблоки, Томатный суп, Торт и т.д. По желанию попробуйте придумать что-нибудь своё, если
// не получится берите уже готовые из задачи варианты. В абстрактный класс добавьте общие для всех
// продуктов поля “цена”, “единица измерения”(может быть: “кг”, “литр”) и поле
// “тип”(может быть например: “десерт”, “1ое блюдо”, “2ое блюдо”, “гарнир”, “напиток” и т.д.). В абстр.
// классе должны быть 2 метода: “по
//казать информацию” и “готовить”, 1й метод реализован в абстрактном классе и выводит значения всех полей
// в консоль, 2й метод абстрактный и реализуется в подклассах, например выводом в консоль для Яблока “помыть”,
// для Томатного супа - “разогреть в кастрюле”, для Торта - “порезать на равные кусочки чтобы досталось каждому”.
// Создайте метод main, в массив добавьте несколько продуктов и через цикл вызовите оба метода на каждом продукте.
public class Task1 {
    public static void main(String[] args) {
//        Product apple = new Apple(10, 1, "фрукт");
//        Product cake = new Cake(15, 1, "десерт");
//        Product drink = new Drink(12, 0.5, "напиток");
        Product[] products = {new Apple(10, 1, "фрукт"), new Cake(15, 1, "десерт"),
                new Drink(12, 1, "напиток")};
        for (Product product: products
             ) {
            product.showInform();
            product.cook();
            System.out.println();
        }
    }
}

abstract class Product {
    int price;
    int weight;
    String type;

    public Product(int price, int weight, String type) {
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    void showInform() {
        System.out.println("Цена: " + price);
        System.out.println("Вес: " + weight);
        System.out.println("Тип: " + type);
    };
    abstract void cook();
}

class Apple extends Product {

    public Apple(int price, int weight, String type) {
        super(price, weight, type);
    }

    @Override
    void cook() {
        System.out.println("Помыть.");
    }
}

class Cake extends Product {

    public Cake(int price, int weight, String type) {
        super(price, weight, type);
    }

    @Override
    void cook() {
        System.out.println("Порезать на части.");
    }
}

class Drink extends Product {

    public Drink(int price, int weight, String type) {
        super(price, weight, type);
    }

    @Override
    void cook() {
        System.out.println("Налить в кружку.");
    }
}