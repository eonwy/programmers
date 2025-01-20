import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> key = new HashMap<>();
        
        for (int i=0; i<keymap.length; i++) {
            for (int j=0; j<keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                
                if (!key.containsKey(c)) {
                    key.put(c, j+1);
                } else {
                    key.put(c, Math.min(key.getOrDefault(c, 0), j+1));
                }
            }
        }
        
        for (int i=0; i<targets.length; i++) {
            for (int j=0; j<targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                
                if (key.containsKey(c)) {
                    answer[i] += key.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
            
            if (answer[i] == 0) answer[i] = -1;
        }
        
        return answer;
    }
}