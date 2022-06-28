package level3.lesson3.path2;

public class Hospital {
    public static void main(String[] args) {
        Doctor therapist = new Doctor();
        Doctor surgeon = new Surgeon();
        Doctor dentist = new Dentist();
        Doctor surgeon2 = new Surgeon();
        Doctor dentist2 = new Dentist();

        Doctor[] doctors = new Doctor[5];
        doctors[0] = therapist;
        doctors[1] = surgeon;
        doctors[3] = surgeon2;
        doctors[2] = dentist;
        doctors[4] = dentist2;

        for (Doctor currDoc : doctors) {
            currDoc.treat();
        }
    }
}
