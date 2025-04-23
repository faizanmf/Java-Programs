public class AmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int r;
        int temp=n;
        int s=0;

        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(temp==s)
        {
            System.out.println("Amstrong Number");
        }
        else
        {
            System.out.println("Not Amstrong Number");
        }
    }
}
