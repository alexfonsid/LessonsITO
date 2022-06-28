package level1.Examen;

public class SmL {
//
//    Дано расстояние L в сантиметрах.
//    Использую операцию деления нацело, найти количество полных метров в нём (1м = 100см)
public static void main(String[] args) {
    int L = 437;
    System.out.println((L - L % 100) / 100);
}


}
