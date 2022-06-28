package level3.lesson4;

public class ObjectEx {
    int age = 20;
    String name = "Petya";
    //    class Object
    public static void main(String[] args) {
        ObjectEx simpleObj = new ObjectEx();
        System.out.println(simpleObj.toString());

    }

    @Override
    public String toString() {
        return "ObjectEx{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
//
//class A {}
////class A extends Object {}
//
//class Parent {}
//class Child extends Parent {}
