package Practice;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
//        List<String> s = new ArrayList<>(List.of("faizan", "safa", "Mf", "sumaiya"));
//List<String> res = new ArrayList<>();
//        for (String a : s) {
//            char fc = a.charAt(0);
//            char change;
//            if(Character.isLowerCase(fc))
//            {
//                change = Character.toUpperCase(fc);
//            } else {
//                change = Character.toLowerCase(fc);
//            }
//            String updatedWord = change + a.substring(1);
//            res.add(updatedWord);
//        }
//        System.out.println(res);

//        Set<String> s = new HashSet<>();
//
//        s.add("faizan");
//        s.add("mf");
//        s.add("sumaiya");
//
//        Iterator<String> it = s.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//
//        System.out.println("----------------------------");
//
//        for(String a : s)
//        {
//            System.out.println(a.toString());
//        }
//        System.out.println("----------------------------");
//
//        s.stream().forEach(System.out::println);
//
//
//        System.out.println();

//        Map <Character, Integer> n = new HashMap<>(
//                Map.of('a',1,
//                'b',2,
//                'c',3)
//        );
//       Character key = n.entrySet().stream().filter(e->e.getValue()==2)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(null);
//
//        System.out.println(key);

        String a ="teSt AutOmation";
        a=a.toLowerCase();

        HashMap<Character, Integer> n = new HashMap<Character, Integer>(
                Map.of('a', 0, 'e', 0, 'i', 0, 'o', 0, 'u', 0));
        int vc =0;
        int cc=0;


        for(char b:a.toCharArray())
        {
            if(n.containsKey(b))
            {
                n.put(b, n.get(b)+1);
                vc++;
            }

            else if(Character.isLetter(b))
            {
                cc++;
            }

        }

        for(var e : n.entrySet())
        {
            //if(e.getKey().toString()="")
            {
                System.out.println(e.getKey()+" "+ e.getValue());
            }
        }

        System.out.println(vc);
        System.out.println(cc);
    }
}











