package String;

public class Remove_Duplicate_in_Strin {
    public static void main(String[] args) {
        String a= "good";

        String rem = "";

        for(int i=0;i<a.length();i++)
        {
            if(!rem.contains(String.valueOf(a.charAt(i))))
            {
                rem = rem + a.charAt(i);
            }
        }
        System.out.println(rem);
    }
}
