package level3.lesson1.path2;

public class StaticNoStaticEx {
    static int x = 10;
    int y = 10;

    static void showStatic() {
        System.out.println(StaticNoStaticEx.x);
    }

    void showNoStatic() {
        System.out.println(y);
    }

    public static void main(String[] args) {
        showStatic();
//        StaticNoStaticEx.showStatic();
        StaticNoStaticEx ex = new StaticNoStaticEx();
        ex.showNoStatic();
        new StaticNoStaticEx().showNoStatic();
    }
}
