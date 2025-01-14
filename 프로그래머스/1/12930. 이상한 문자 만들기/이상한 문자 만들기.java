import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int num = 0;
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c);
                num = 0;
            } else {
                if (num % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                    num++;
                } else {
                    answer.append(Character.toLowerCase(c));
                    num++;
                }
            }
        }
        
        return answer.toString();
    }
}