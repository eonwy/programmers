import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();
        
        temp.add(5);
        while(!temp.isEmpty()) {
            int current = temp.poll();
            
            if (current >= l && current <= r) {
                answer.add(current);
            }
            
            if (current * 10 <= r) {
                temp.add(current * 10);
                temp.add(current * 10 + 5);
            }
        }
        
        if(answer.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}