public class SumOfPairs {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5,6,7,8,9,10};
        int total=10;
        int count=0;

        for (int i=0; i<n.length; i++)
        {
            for (int j=i+1; j<n.length; j++)
            {
                if (n[i]+n[j]==total)
                {

                    System.out.println(n[i]+" "+n[j]);
                    count++;
                }
            }
        }
        System.out.println("Total pairs: "+count);

    }
}
