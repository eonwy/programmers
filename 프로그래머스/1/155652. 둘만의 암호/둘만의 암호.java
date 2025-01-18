import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            
            for (int j = 0; j < index; j++) {
                sChar += 1;
                if (sChar > 'z') {
                    sChar -= 26;
                }
                
                if (skip.contains(String.valueOf(sChar))) {
                    j--;
                }
            }
            
            answer += String.valueOf(sChar);
        }
        
        return answer;
    }
}