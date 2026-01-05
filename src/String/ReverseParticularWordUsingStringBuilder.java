package String;

public class ReverseParticularWordUsingStringBuilder {
    public static void main(String[] args) {
        String a = "faizan the best";
        String[] b = a.split(" ");

        StringBuilder sb = new StringBuilder();


        for (String c : b) {

            if (c.equals("best")) {
                sb.append(new StringBuilder(c).reverse());
            } else {
                sb.append(c);
            }
            sb.append(" ");
        }


        System.out.println(sb);

    }


}
