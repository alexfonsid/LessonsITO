package level4.lesson3.path1;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        if (age < 0) {
//            IncorrectAgeException
            try {
                throw new IncorrectAgeException("Возраст должен быть больше нуля");
            } catch (IncorrectAgeException e) {
                e.printStackTrace();
            }
        }
        this.age = age;
    }
}
