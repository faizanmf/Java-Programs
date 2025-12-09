package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonReapeatedChar {
    public static void main(String[] args) {

        String s ="aabbcdeff";

        Map<Character, Integer> n = new LinkedHashMap<>();

        for(char c : s.toCharArray())
        {
            if(n.containsKey(c))
            {
                n.put(c, n.get(c)+1);
            }
            else {
                n.put(c, 1);
            }
        }

        Character last =null;
        for(Map.Entry<Character, Integer> e : n.entrySet())
        {
            if(e.getValue() ==1)
            {
                last =e.getKey();

            }
        }
        System.out.println(last);
    }
}
