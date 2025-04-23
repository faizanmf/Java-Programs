import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SortInDesending {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,1,2,2,3,3,4,4,5,5));

        HashSet<Integer> n = new HashSet<Integer>(arr);

        n.stream()
                .sorted((a, b) -> b - a) // Sort in descending order
                .forEach(e -> System.out.print(e + " "));
    }
}
