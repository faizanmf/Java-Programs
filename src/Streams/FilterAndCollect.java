package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(List.of(11,22,33,44,55,66,77,88,99,100));

      List<Integer> res =  n.stream().filter(a->a>50)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
