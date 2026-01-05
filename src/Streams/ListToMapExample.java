package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("java", "selenium", "api");

       Map<String, Integer> a = names.stream().collect(Collectors.toMap(name -> name, name ->name.length()));
        System.out.println(a);
    }
}
