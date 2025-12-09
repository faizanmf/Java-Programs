package String;

public class RemoveSpaceInString {
    public static void main(String[] args) {
        String a="faizan mf";
        String rem= "";

        rem=a.replaceAll(" ", "");
        System.out.println(rem);
    }
}
