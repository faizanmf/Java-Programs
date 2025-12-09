package String;

import java.util.HashMap;

public class MaximumValueInString {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a"};

        HashMap<String, Integer> n = new HashMap<String, Integer>();

        for (String b : a) {
            // Check if the key is already in the map
            if (n.containsKey(b)) {
                // Increment the count for the existing key
                n.put(b, n.get(b) + 1);
            } else {
                // Add the key with an initial count of 1
                n.put(b, 1);
            }
        }
        int count = 0;

        for (int e : n.values()) {
            if (e > count) {
                count = e;
            }
        }

        // Iterate over the entries in the map
        for (var i : n.entrySet()) {
            if (i.getValue() == count) {
                // Print the key and its count
                System.out.println(i.getKey() + " " + i.getValue());
            }
        }
    }
}

