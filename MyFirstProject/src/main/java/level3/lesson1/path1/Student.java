package level3.lesson1.path1;

public class Student {
    void playMusic() {
        System.out.println("Tra-ta-ta");
    }

    void singSong(String lirycs) {
        System.out.println("I can sing " + lirycs);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.playMusic();
        petya.playMusic();
        petya.playMusic();
        petya.singSong("I can fly");
        petya.singSong("I want to be free");
        petya.singSong("we are the champions!");
    }
}
