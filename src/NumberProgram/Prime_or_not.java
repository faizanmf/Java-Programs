package NumberProgram;

public class Prime_or_not {
    public static void main(String[] args) {
        int n=7 ;
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }

        // Loop to check if n is divisible by any number from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
