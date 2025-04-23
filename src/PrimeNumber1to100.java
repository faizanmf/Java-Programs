public class PrimeNumber1to100 {
    public static void main(String[] args) {

        int s=1;
        int e=100;

        for(int i=s;i<+e;i++)
        {
            int counter=0;
            for(int j=2;j<i/2;j++)
            {
                if(i%j == 0)
                {
                    counter++;
                    break;
                }
            }
            if(counter ==0 && i!=1)
            {
                System.out.println(i);
            }

        }
    }
}
