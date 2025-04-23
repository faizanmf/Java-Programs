public class DuplicateWords {
    public static void main(String[] args) {
        String a ="faizan m f";

        String dup="";

        String[] b = a.split(" ");
        for(String c : b)
        {
            dup= dup + c + " " + c + " ";
        }
        System.out.println(dup);
    }
}
