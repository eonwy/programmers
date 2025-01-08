import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] temp = String.valueOf(n).split("");
        Arrays.sort(temp, Collections.reverseOrder());
        
        for(int i=0; i<temp.length; i++) {
            answer = answer * 10 + Integer.parseInt(temp[i]);
        }
        
        return answer;
    }
}