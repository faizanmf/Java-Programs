import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {
        String a ="faizan is the best";
        String[] b= a.split(" ");
        String rev="";

        for(String word : b)
        {
            String revWord ="";

            for(int i=word.length()-1;i>=0;i--)
            {
                revWord = revWord + word.charAt(i);
            }
            rev = rev + revWord + " ";
        }
        System.out.println(rev.trim());
    }
}
