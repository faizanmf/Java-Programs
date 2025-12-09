package String;

import java.util.Arrays;



public class Anagram {
    public static void main(String[] args) {

        String a = "silent";
        String b = "Listen";

        // Convert both strings to lowercase to handle case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths are equal
        if (a.length() != b.length()) {
            System.out.println("Not String.Anagram");
            return;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("String.Anagram");
        } else {
            System.out.println("Not String.Anagram");
        }
    }
}
