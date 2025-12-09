package NumberProgram;

import java.util.HashSet;
import java.util.List;

public class RemoveDupInNum {
    public static void main(String[] args) {

        List<Integer> n = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
        HashSet<Integer> nn = new HashSet<Integer>(n);
        System.out.println(nn);
    }
}
