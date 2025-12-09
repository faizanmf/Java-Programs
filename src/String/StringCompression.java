package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {

        String a = "aabbcdaav";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb =new StringBuilder();

        for(char d : a.toCharArray())
        {
            if(map.containsKey(d))
            {
                sb.append(d).append(map.get(d));
                map.remove(d);
            }
        }
        System.out.println(sb);
    }
}
