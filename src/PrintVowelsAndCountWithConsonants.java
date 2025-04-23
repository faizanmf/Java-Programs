import java.util.HashMap;
import java.util.Map;

public class PrintVowelsAndCountWithConsonants {
    public static void main(String[] args) {
        String a ="teSt AutOmation";

        HashMap<Character, Integer> n = new HashMap<Character, Integer>(
                Map.of('a', 0, 'e', 0, 'i', 0, 'o', 0, 'u', 0));

        int vCount = 0;
        int cCount = 0;

        for(char ch : a.toCharArray())
        {
            ch = Character.toLowerCase(ch);
            if(n.containsKey(ch))
            {
                n.put(ch, n.get(ch)+1);
                vCount++;
            }
            else if(Character.isLetter(ch))
            {
                cCount++;
            }
        }

        for(var e : n.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("Vowels Count: " + vCount);
        System.out.println("Consonants Count: " + cCount);

    }
}
