import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        
        for(int i=0; i<s.length();i++){
            if((i == 0 || sChar[i] != sChar[i-1]) && (i == sChar.length-1 || sChar[i] != sChar[i+1])){
                answer.append(sChar[i]);
            }
        }
        return answer.toString();
    }
}