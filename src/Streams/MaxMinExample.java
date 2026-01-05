package Streams;

import java.util.Arrays;
import java.util.List;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 30, 25);

        long max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);
        long min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);
        
    }
}
