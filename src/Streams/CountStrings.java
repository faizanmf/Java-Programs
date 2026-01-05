package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "ant", "dog");

      long res =  list.stream().filter(a->a.startsWith("a"))
                .count();
        System.out.println(res);
    }
}
