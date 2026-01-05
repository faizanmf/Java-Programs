package String;

public class CaseConversion {
    public static void main(String[] args) {


        String lower = "abcd";
        String upper = "ABCD";

        StringBuilder sb = new StringBuilder();

        for (char a : lower.toCharArray())
        {
            if(Character.isLowerCase(a))
            {
                sb.append(Character.toUpperCase(a));
            }
        }

        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();

        for(char b : upper.toCharArray())
        {
            if (Character.isUpperCase(b))
            {
                sb1.append(Character.toLowerCase(b));
            }
        }

        System.out.println(sb1);
    }
}
