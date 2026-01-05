package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2Array {
    public static void main(String[] args) {

        int[] a ={1,3,4,5,6};
        int[] b ={1,2,3,7,8, 9};

        Arrays.sort(a);
        Arrays.sort(b);

        int[] c = new int[a.length + b.length];

        for(int i=0; i<a.length; i++)
        {
            c[i] = a[i];
        }

        for(int i=0; i<b.length; i++)
        {
            c[a.length+i] = b[i];
        }

        System.out.println(Arrays.toString(c));

//        int[] a = {1, 3, 4, 5, 6};
//        int[] b = {1, 2, 3, 7, 8, 9};
//
//        int[] c = IntStream
//                .concat(Arrays.stream(a), Arrays.stream(b))
//                .sorted()
//                .toArray();
//
//        System.out.println(Arrays.toString(c));

    }
}
