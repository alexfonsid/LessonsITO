package level4.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
//  stream()
//     Types:
//       промежуточные: filter(), map(), sorted(), limit()
//       терминальные: forEach(), count(), collect(), anyMatch(), allMatch(), findFirst()

//  Поток данных -> промежуточные методы -> 1 терминальный метод

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

//        long quantity = numbers.stream()
//                .count();
//        System.out.println(quantity);

//        for (Integer num : numbers) {
//            if (num > 50) System.out.println(num);
//        }
//
//        numbers.stream()
//                .filter((num) -> num > 50)
//                .forEach((elem) -> System.out.println(elem));
////
//        int qu = 0;
//        for (Integer num: numbers) {
//            qu++;
//        }
//        System.out.println(qu);
////
//        for (Integer evenNumbers : numbers.stream()
//                .filter((num) -> num % 2 == 0)
//                //                .forEach((elem) -> System.out.println(elem));
//                .collect(Collectors.toList())) {
//            System.out.println(evenNumbers);
//        }
//        long count = numbers.stream()
//                .filter((num) -> num > 45).count();
//        System.out.println(count);
//
//        List<Integer> myLI = numbers.stream()
//                .map((e) -> e*e)
//                .collect(Collectors.toList());
//        System.out.println(myLI);

        List<Integer> myLI = numbers.stream()
                .map((e) -> e*e)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(myLI);

        boolean hasNumMoreFifty = numbers.stream()
//                .anyMatch((e) -> e > 10)  - любой
                .allMatch((e) -> e > 50); // все
        System.out.println(hasNumMoreFifty);

        Optional<Integer> firstOptional = numbers.stream()
                .filter((elem) -> elem > 90)
                .findFirst();
        System.out.println(firstOptional);
    }
}
