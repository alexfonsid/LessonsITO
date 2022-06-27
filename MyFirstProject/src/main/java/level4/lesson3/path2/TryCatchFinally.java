package level4.lesson3.path2;

public class TryCatchFinally {
    public static void main(String[] args) {
//        try {
//            //code
//        }   catch (Exception e)    {
//            //code
//            System.out.println("Error: " + e);
//        } finally {
//            //code
//        }

        System.out.println("Begin of main");
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        try {
            System.out.println(shops[12]);
            System.out.println("Middle of main");
        } catch (ArithmeticException e) {
            System.out.println("Error - " + e);
        } finally {
            System.out.println("Hello from finally");
        }
        System.out.println("End of main");
    }
}
