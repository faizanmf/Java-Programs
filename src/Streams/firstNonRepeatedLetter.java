package Streams;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class firstNonRepeatedLetter {
    public static void main(String[] args) {

        String s ="swiss";

       Character np = s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c-> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(np);

    }
}
