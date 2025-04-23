public class SumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int r=0;
        int sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
