import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        Map<Character, Integer> yCount = new HashMap<>();
        for (char c : Y.toCharArray()) {
            yCount.put(c, yCount.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder temp = new StringBuilder();
        
        for (char c : X.toCharArray()) {
            if (yCount.getOrDefault(c, 0) > 0) {
                temp.append(c);
                yCount.put(c, yCount.get(c) - 1);
            }
        }
        
        if (temp.length() == 0) {
            return "-1";
        }
        
        char[] chars = temp.toString().toCharArray();
        Arrays.sort(chars);
        temp = new StringBuilder(new String(chars));
        temp.reverse();
        
        if (temp.toString().replace("0", "").isEmpty()) {
            return "0";
        }
        
        return temp.toString();
    }
}