import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedUntil = 0;
        
        for (int s : section) {
            if (s > paintedUntil) {
                paintedUntil = s + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}