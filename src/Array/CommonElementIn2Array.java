package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementIn2Array {
    public static void main(String[] args) {

        int[] a ={1,3,4,5,6};
        int[] b ={1,2,3,7,8};

        Set<Integer> n = new HashSet<>();

        for(int i=0; i<a.length;i++ )
        {
            for(int j=0; j<b.length;j++)
            {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
