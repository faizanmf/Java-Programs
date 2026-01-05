package Array;

public class MissingNumInArray {
    public static void main(String[] args) {

        int[] n ={1,2,3,7,8,9};

        boolean[] a = new boolean[10];

        for(int i=0; i<n.length; i++)
        {
            a[n[i]] = true;
        }

        for(int i=1; i<10; i++)
        {
            if(!a[i])
                System.out.println(i);
        }



    }
}
