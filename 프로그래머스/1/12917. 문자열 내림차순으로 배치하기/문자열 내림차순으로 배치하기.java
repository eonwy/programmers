import java.util.*;

class Solution {
    public String solution(String s) {
        String[] temp = new String[s.length()];
        temp = s.split("");
        Arrays.sort(temp);
        
        String answer = "";
        
        for(int i=temp.length-1; i>=0; i--) {
            answer += temp[i];
        }
        
        return answer;
    }
}