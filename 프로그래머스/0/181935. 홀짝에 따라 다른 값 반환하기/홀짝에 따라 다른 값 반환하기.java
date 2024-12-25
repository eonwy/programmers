import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            if (n % 2 == 0) {
                answer += i%2 == 0 ? Math.pow(i, 2) : 0;
            } else {
                answer += i%2 != 0 ? i : 0;
            }
        }
        
        return answer;
    }
}