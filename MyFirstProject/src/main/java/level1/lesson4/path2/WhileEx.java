package level1.lesson4.path2;

public class WhileEx {
    public static void main(String[] args) {
        int saturation = 20;
//        while (saturation < 100){
//            System.out.println(saturation);
//            saturation += 10;
//        }
//        System.out.println(saturation);
        do {
            System.out.println(saturation);
            saturation += 10;
        } while (saturation < 100);
        System.out.println(saturation);

    }


}
