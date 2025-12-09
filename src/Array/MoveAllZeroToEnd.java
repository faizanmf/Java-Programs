package Array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {

        int[] n ={0,1,0,2,0,3,0,4,0,5};

        int nz=0;

        for(int i : n)
        {
            if(i!=0)
            {
                n[nz++] = i;
            }
        }

        while(nz < n.length)
        {
            n[nz++] = 0;
        }
        System.out.println(Arrays.toString(n));
    }
}
