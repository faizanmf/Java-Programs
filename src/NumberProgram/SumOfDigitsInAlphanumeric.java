package NumberProgram;

public class SumOfDigitsInAlphanumeric {
    public static void main(String[] args) {

        String n="ab12ssd25fjh8";
        char[] a =n.toCharArray();

        int sum=0;

        for(int i=0; i<a.length; i++)
        {
            if(Character.isDigit(a[i]))
            {
                sum =sum+ Character.getNumericValue(a[i]);
            }
        }

        System.out.println(sum);
    }
}
