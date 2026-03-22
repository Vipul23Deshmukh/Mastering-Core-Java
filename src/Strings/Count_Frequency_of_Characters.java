package Strings;


import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_of_Characters {
    public static void main(String[] args) {


        String s = "aabbbcc";
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

    }


}
