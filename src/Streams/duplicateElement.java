package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 10,90,90,80,40,60);

       Set<Integer> dup = list.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(dup);
    }
}
