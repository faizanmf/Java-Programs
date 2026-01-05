package Streams;

public class sumOfNum {
    public static void main(String[] args) {

        int n=12345;


       int sum = String.valueOf(n).chars()
                .map(m->m-'0')
                .sum();
        System.out.println(sum);
    }
}
