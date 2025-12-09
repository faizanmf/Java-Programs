package String;

public class ReverseStringAlone {
    public static void main(String[] args) {
        String a = "123@faizan";
        char[] ch = a.toCharArray();
        int l = 0;
        int r = ch.length - 1;

        // Continue until the two pointers meet
        while (l < r) {
            // Move the left pointer to the right until it points to an alphabetic character
            while (l < r && !(Character.isLetter(ch[l]))) {
                l++;
            }
            // Move the right pointer to the left until it points to an alphabetic character
            while (l < r && !(Character.isLetter(ch[r]))) {
                r--;
            }

            // If both pointers point to alphabetic characters, swap them
            if (Character.isLetter(ch[l]) && Character.isLetter(ch[r])) {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }

        // Convert the character array back to a string and print the result
        String rev = new String(ch);
        System.out.println(rev);
    }
}
