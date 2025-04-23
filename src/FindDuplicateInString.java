import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateInString {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>(
        List.of("apple", "ball", "cherry", "apple", "ball"));

        HashMap<String, Integer> n = new HashMap<>();

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

        // Iterate over the entries in the map
        for (var e : n.entrySet()) {
            if (e.getValue()>1) {
                System.out.println("Duplicate element is: " + e.getKey().toString());
            }


        }
    }
}
