package Streams;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>(List.of(11,22,33,44,55,66,77,88,99,100));

        n.stream().filter(a->a%2==0)
                .forEach(System.out::println);
    }
}
