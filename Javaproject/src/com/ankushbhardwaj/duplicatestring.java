package com.ankushbhardwaj;

import java.util.HashMap;
import java.util.Map;

public class duplicatestring {
   public static void main(String[] args) {
        String s = "Ankush Bhardwaj";
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!h.containsKey(s.charAt(i))) {
                h.put(s.charAt(i), 1);
            } else {
                h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
            }
        }
        for(Map.Entry map: h.entrySet()){
            int value=((int)map.getValue());
            char key=(char)map.getKey();


            if(value>1){
                System.out.println(key+",count="+value);
            }
        }

    }
 /* static void printDups(String str)
  {
      HashMap<Character, Integer> count = new HashMap<>();

      for (int i = 0; i < str.length(); i++) {
          if (!count.containsKey(str.charAt(i)))
              count.put(str.charAt(i), 1);
          else
              count.put(str.charAt(i),
                      count.get(str.charAt(i)) + 1);
      }


      for (Map.Entry mapElement : count.entrySet()) {
          char key = (char)mapElement.getKey();
          int value = ((int)mapElement.getValue());

          if (value > 1)
              System.out.println(key
                      + ", count = " + value);
      }
  }
    // Driver code
    public static void main(String[] args)
    {
        String str = "test string";
        printDups(str);
    }*/
}