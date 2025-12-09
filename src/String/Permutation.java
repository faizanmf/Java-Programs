package String;

public class Permutation {
    public static void main(String[] args) {

        String s= "ABC";
        permute("", s);

    }


    public static void permute(String a, String s)
    {
        if(s.isEmpty()) {
            System.out.println(a);
            return;
        }

        for(int i=0; i<s.length();i++)
        {
            permute(a+s.charAt(i), s.substring(0,i)+s.substring(i+1));
        }
    }
}
