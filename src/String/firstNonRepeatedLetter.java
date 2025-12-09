package String;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatedLetter {
    public static void main(String[] args) {

        String s ="swiss";

        HashMap<Character, Integer> n = new HashMap<>();

        for(char c : s.toCharArray())
        {
            n.put(c,n.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> e : n.entrySet())
        {
            if(e.getValue() == 1)
            {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
