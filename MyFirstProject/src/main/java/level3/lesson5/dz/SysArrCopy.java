package level3.lesson5.dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SysArrCopy {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        System.out.println(numbers.size());
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(generator.nextInt(100));
        }
//        for (Integer currNum : numbers) {
//            currNum = generator.nextInt(100);
//        }
        System.out.println(numbers);
        System.out.println(numbers.size());
        int[] destinationNum = {2,1,2,2,1};
//        System.arraycopy(destinationNum, 0, numbers, 0, 5);
        System.out.println(Arrays.toString(destinationNum));
    }
}
