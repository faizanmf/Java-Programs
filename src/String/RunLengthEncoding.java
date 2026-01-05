package String;

public class RunLengthEncoding {
    public static void main(String[] args) {

        String a ="aaabbcdddd";
        StringBuilder sb =new StringBuilder();

        int count =1;

        for(int i=1;i<=a.length();i++)
        {
            if(i<a.length() && a.charAt(i) == a.charAt(i-1))
            {
                count++;

            }
            else
            {
                sb.append(a.charAt(i-1)).append(count);
                count=1;
            }

        }

        System.out.println(sb);
    }
}
