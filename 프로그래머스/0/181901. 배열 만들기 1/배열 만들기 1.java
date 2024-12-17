import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(k*i <= n) {
                answer.add(k*i);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}