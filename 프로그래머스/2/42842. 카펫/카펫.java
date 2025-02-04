import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for (int a=1; a<=yellow; a++) {
            if (yellow % a == 0) {
                int b = yellow / a;
                
                if ((a + 2) * (b + 2) == total) {
                    answer[0] = Math.max(a + 2, b + 2);
                    answer[1] = Math.min(a + 2, b + 2);
                }
            }
        }
        
        return answer;
    }
}