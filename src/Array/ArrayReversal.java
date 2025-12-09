package Array;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] n = {9,8,7,6,5,4,3,2,1};

        int start =0;
        int end = n.length-1;

        while(start < end)
        {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;

            start++;
            end--;

        }

        System.out.println(Arrays.toString(n));


    }


}
