package NumberProgram;

public class PrintOnlyNumInString {
    public static void main(String[] args) {

        String n="ab12ssd25fjh8";
        char[] a =n.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n.length(); i++)
        {
            if(Character.isDigit(a[i]))
            {
                sb.append(a[i]+",");
            }
        }

        //to remove last comma
        if(sb.length()>0)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());



    }
}
