package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfStringToUppercase {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("abc", "pqr", "xyz", "aaa", "bbb", "ccc");

        s.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
