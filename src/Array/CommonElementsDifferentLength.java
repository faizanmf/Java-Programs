package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsDifferentLength {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40,40};
        int[] arr2 = {30, 40, 50};

        Set<Integer> n = new HashSet<Integer>();

        for(int a : arr1)
        {
            n.add(a);
        }

        for(int b:arr2)
        {
            if(n.contains(b))
            {
                System.out.println(b+" ");
            }
        }
    }
}
