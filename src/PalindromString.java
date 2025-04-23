public class PalindromString {
    public static void main(String[] args) {
        String a ="dood";
        String rev="";

        for(int i=a.length()-1;i>=0;i--)
        {
            rev=rev+a.charAt(i);
        }

        if(a.equals(rev))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("not Palindrom");
        }
    }
}
