package Streams;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);

       int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
