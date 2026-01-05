package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDecending {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 50,90,70,80,40,60);

       List<Integer> ascending = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascending);

        List<Integer> decending = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(decending);
    }
}
