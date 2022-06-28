package level3.lesson1.path2;

// В main создать объекты этого класса также по картинке
// и присвоить полям значения с картинки. В методах выводить что делает метод,
// например для метода “eat” выводить “я ем”, либо по английски “I eat”
public class Dog {
    String breed;
    String size;
    int age;
    String color;

    public static void eat() {
        System.out.println("I'm eating");
    }

    public static void sleep() {
        System.out.println("I'm sleeping");
    }

    public static void sit() {
        System.out.println("I'm sitting");
    }

    public static void run() {
        System.out.println("I'm running");
    }

    void printInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println();
    }

    void doAllActions() {
        eat();
        sleep();
        sit();
        run();
    }

    Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public static void main(String[] args) {

        Dog neapolitanMastiff = new Dog("Neapolitan Mastiff", "Large", 5, "Black");
        Dog chowChow = new Dog("Chow Chow", "Medium", 3, "Brown");
        Dog maltese = new Dog("Maltese", "Small", 2, "White");
        neapolitanMastiff.doAllActions();
        chowChow.printInfo();
        maltese.printInfo();
        neapolitanMastiff.printInfo();
    }
}
