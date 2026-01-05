package Streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("QA", "DEV", "SDET");

        list.stream().findFirst().ifPresent(System.out::println);
    }
}
