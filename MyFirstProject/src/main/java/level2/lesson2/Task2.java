package level2.lesson2;

public class Task2 {
//    Создайте внутри метода main массив String на 4 ячейки.
//    Дайте имя переменной созданного массива - names.
//    Заполните массив произвольными именами.
//    После этого выведите каждую ячейку на консоль.

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Olga";
        names[2] = "Vlad";
        names[3] = "Roman";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
