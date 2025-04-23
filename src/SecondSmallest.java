public class SecondSmallest {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        int fir = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;

        for(int num : n)
        {
            if(num < fir)
            {
                sec = fir;
                fir = num;
            }
            else if(num < sec && num > fir)
            {
                sec = num;
            }
        }

        System.out.println("Smallest: "+fir);
        System.out.println("Second Smallest: "+sec);
    }
}
