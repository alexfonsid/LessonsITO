package level3.lesson3.path2;

public class Doctor {
    void treat() {
        System.out.println("Temp, diagnostic, go to other doc.");
    }

}

class Surgeon extends Doctor {
    @Override
    void treat() {
        System.out.println("Cut and sew!");
    }
}

class Dentist extends Doctor {
    @Override
    void treat() {
        System.out.println("Treat teeth!");
    }
}