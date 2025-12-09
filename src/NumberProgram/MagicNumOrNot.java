package NumberProgram;

public class MagicNumOrNot {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1081;
        int temp = n; // Save original number

        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum = sum + n % 10;
            n /= 10;
        }

        if (sum == 1) {
            System.out.println(temp + " is a Magic Number");
        } else {
            System.out.println(temp + " is not a Magic Number");
        }
    }
}
