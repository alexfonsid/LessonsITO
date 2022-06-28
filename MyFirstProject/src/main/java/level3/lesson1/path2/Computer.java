package level3.lesson1.path2;

public class Computer {
    int memory;
    boolean isBroken;

    public Computer(int memory, boolean isBroken) {
//        System.out.println("Hello from constructor");
        this.memory = memory;
        this.isBroken = isBroken;
    }

    public static void main(String[] args) {
        Computer pc1 = new Computer(512, true);
        Computer pc2 = new Computer(1024, false);
        Computer pc3 = new Computer(2048, false);
        System.out.println(pc1.memory + " " + pc1.isBroken);
        System.out.println(pc2.memory + " " + pc2.isBroken);
        System.out.println(pc3.memory + " " + pc3.isBroken);

        //        System.out.println("End of main()");
    }
}
