package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class countChar {
    public static void main(String[] args) {

        String a = "faizan is best";

       Map<Character, Long> count = a.chars()
                .mapToObj(c ->(char)c)
               .filter(c->c!=' ')
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        System.out.println(count);
    }
}
