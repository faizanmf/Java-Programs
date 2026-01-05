package NumberProgram;

public class PerfectSquare {
    public static void main(String[] args) {
        int n =49;

        int sq = (int) Math.sqrt(n);
        if (sq * sq == n) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}
