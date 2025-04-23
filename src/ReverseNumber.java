public class ReverseNumber {
    public static void main(String[] args) {
        int n =12345;
        int r;
        int temp=n;
        int s=0;

        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        System.out.println(s);
    }
}
