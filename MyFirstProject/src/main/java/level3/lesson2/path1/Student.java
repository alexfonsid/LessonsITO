package level3.lesson2.path1;

public class Student {
    String name;
    int groupNumber;

    public Student(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
        System.out.println("Hi from StudentConstructor!");
    }

    public static void main(String[] args) {
        Student student = new Student("Masha", 356);
        System.out.println(student.name + " " + student.groupNumber);
        Aspirant aspirant = new Aspirant();
        System.out.println(aspirant.name + " " + aspirant.groupNumber + " " + aspirant.scienceTopic);
        Aspirant aspirant2 = new Aspirant("Vasya", 555, "Mega Topic");

        Aspirant david = new Aspirant("David", 634, "Science");
        System.out.println(david.name + " " + david.groupNumber + " " + david.scienceTopic);

        aspirant.name = "Fedya";
        System.out.println(aspirant2.name + " " + aspirant2.groupNumber + " " + aspirant2.scienceTopic);
    }
}

