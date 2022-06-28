package level3.lesson1.path2;

public class MyComputer {
    int memory;

    public MyComputer() {
    }

    MyComputer(int memory){
        this.memory = memory;
    }

    public static void main(String[] args) {
        MyComputer pc = new MyComputer();
        MyComputer pc2 = new MyComputer(512);


    }
}
