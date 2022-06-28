package level1.lesson4.path1;

public class ForExample {
    public static void main(String[] args) {
        int myFloor = 27;
        int currentFloor = 1;
        for (; currentFloor < myFloor; currentFloor++) {
            if (currentFloor >= 10) {
                System.out.println("еду на лифте " + currentFloor);
                continue;
            }
            System.out.println("I'm on floor: " + currentFloor);

        }
        System.out.println(currentFloor);
    }
}
