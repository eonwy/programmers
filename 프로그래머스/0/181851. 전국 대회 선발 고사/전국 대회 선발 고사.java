import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer, Integer> temp = new HashMap<>();
        
        for(int i=0; i<attendance.length; i++) {
            
            if(attendance[i]) {
                temp.put(rank[i], i);
            }
        }
        
        List<Integer> sorted = new ArrayList<>(temp.keySet());
        Collections.sort(sorted);
        
        answer = 10000 * temp.get(sorted.get(0)) + 100 * temp.get(sorted.get(1)) + temp.get(sorted.get(2));
        
        return answer;
    }
}