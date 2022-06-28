package level3.lesson1.path2;
// Создайте класс Error, определите в нем три поля: boolean isActive,
// int statusCode, String message. Добавьте в этом классе 2 конструктора:
// конструктор по умолчанию, конструктор с тремя параметрами, который будет
// инициализировать поля переданными значениями. Создайте метод printInfo,
// который выводит в консоль содержимое полей. Добавьте метод main(), в котором будете
// создавать объект с помощью конструктора по умолчанию, а также несколько объектов с
// помощью конструктора с параметрами. Вызовите на со
//зданных объектах метод printInfo.
public class Error {
    boolean isActive;
    int statusCode;
    String message;

    public Error() {
    }

    public Error(boolean isActive, int statusCode, String message) {
        this.isActive = isActive;
        this.statusCode = statusCode;
        this.message = message;
    }

    void printInfo() {
        System.out.println("is Active: " + isActive);
        System.out.println("status Code: " + statusCode);
        System.out.println("message: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error00 = new Error();
        Error error01 = new Error(true, 01, "End of program");
        Error error02 = new Error(true, 02, "Something wrong");
        error00.printInfo();

        error01.printInfo();

        error02.printInfo();
    }
}
