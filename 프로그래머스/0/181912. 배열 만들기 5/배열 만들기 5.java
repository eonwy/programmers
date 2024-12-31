import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++) {
            String temp = intStrs[i].substring(s, s+l);
            
            if(Integer.parseInt(temp) > k) {
                answer.add(Integer.parseInt(temp));
            }
        }
            
        return answer.stream().mapToInt(i -> i).toArray();
    }
}