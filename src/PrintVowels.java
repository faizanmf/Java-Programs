public class PrintVowels {
    public static void main(String[] args) {
        String a = "faizan";

        for(char ch : a.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch);
            }
        }
    }
}
