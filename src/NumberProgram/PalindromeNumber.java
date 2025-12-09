package NumberProgram;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=1231;
        int temp=n;
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
