package sept.Task;

import java.util.HashMap;
import java.util.Map;

public class Task_03Jan_TCS {
    public static void main(String[] args) {
        String str= "India is great";
        String str1 = str.toLowerCase().replace(" ", "");
        countDuplicate(str1);
    }

    public static void countDuplicate(String str1) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] ch = str1.toCharArray();
        for(char c:ch){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
                
                System.out.println(entry.getKey()+ "----"+ entry.getValue());

        }
    }
}
