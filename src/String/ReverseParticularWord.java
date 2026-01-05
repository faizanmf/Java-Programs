package String;

public class ReverseParticularWord {
    public static void main(String[] args) {

        String a = "faizan the best";
        String[] b = a.split(" ");

        String rev = "";

        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("best")) {  // Corrected: String comparison should use equals()
                String reverseWord = "";
                for (int j = b[i].length() - 1; j >= 0; --j) {
                    reverseWord = reverseWord + b[i].charAt(j);  // Reverse the word
                }
                rev = rev + reverseWord + " ";
            } else {
                rev = rev + b[i] + " ";  // Keep the word as is
            }
        }
        System.out.println(rev.trim());  // Remove any trailing space
    }
    }


