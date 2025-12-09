package NumberProgram;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {

        int[] a = {1,5,4,7,8,9};
        int n =10;

        List<Integer> b = new ArrayList<>();
        boolean[] pre = new boolean[n+1];

        for(int m : a)
        {
            pre[m] = true;
        }

        for(int i=1;i<=n;i++)
        {
            if(!pre[i])
            {
                b.add(i);
            }
        }
        System.out.println(b);
    }
}
