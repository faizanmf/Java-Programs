package Array;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] n = {2,5,8,7,4,1,3,6,9};

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
