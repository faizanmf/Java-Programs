import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        String a="silent";
        String b="listen";

        char[] arr1 =a.toCharArray();
        char[] arr2 =b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = true;

        for(int i=0; i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
            {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}
