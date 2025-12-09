package String;

import java.util.List;

public class PrintVowelCount {
    public static void main(String[] args) {
        String a="test Automation";
        List<Character> n = List.of('a','e','i','o','u');
        int vCount=0;

        for(int i=0;i<a.length();i++)
        {

            char ch = Character.toLowerCase(a.charAt(i));
            if(n.contains(ch))
            {
                vCount++;
            }
        }
        System.out.println(vCount);
    }
}
