package level3.lesson2.path1;

class Aspirant extends Student {
    String scienceTopic;

    Aspirant() {
        super("Default", 777);
    }

    Aspirant(String name, int groupNumber, String scienceTopic) {
        super(name, groupNumber);
        this.scienceTopic = scienceTopic;
        System.out.println("Hi from AspirantConstructor!");
    }
}
