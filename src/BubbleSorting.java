public class BubbleSorting {
    public static void main(String[] args) {
        int[] n={5,2,8,1,6};
        int temp;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length-1;j++)
            {
                if(n[i]>n[j])  // for descending order use n[i]<n[j]
                {
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }

        for (int k : n) {
            System.out.println(k);
        }
    }
}
