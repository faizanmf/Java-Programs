package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(40, 10, 30, 20);

       List<Integer> n = list.stream().sorted().collect(Collectors.toList());
        System.out.println(n);
    }
}
