package level4.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();

//        numbers.stream()
//                .forEach((elem) -> System.out.println(elem));
//int start = System.currentTimeMillis();
        numbers.stream()
                .parallel()
                .forEach((elem) -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " " + elem);
                });



    }
}
