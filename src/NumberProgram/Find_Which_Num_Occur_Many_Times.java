package NumberProgram;

import java.util.HashMap;
import java.util.List;

public class Find_Which_Num_Occur_Many_Times {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 3, 1, 2, 1);

        HashMap<Integer, Integer> n = new HashMap<>();

        // Count the occurrences of each number
        for (int i : a) {
            if (n.containsKey(i)) {
                n.put(i, n.get(i) + 1);
            } else {
                n.put(i, 1);
            }
        }

        int max = 0;

        // Find the maximum frequency
        for (var e : n.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
            }
        }

        // Print the numbers with the maximum frequency
        System.out.print("Numbers that appear the most (" + max + " times): ");
        for (var e : n.entrySet()) {
            if (e.getValue() == max) {
                System.out.print(e.getKey() + " ");
            }
        }
    }
}
