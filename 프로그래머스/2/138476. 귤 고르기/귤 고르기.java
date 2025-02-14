import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int i : tangerine) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> keySort = new ArrayList<>(counts.keySet());
        
        keySort.sort((o1, o2) -> counts.get(o2).compareTo(counts.get(o1)));
        
        int temp = 0;
        
        for (int i : keySort) {
            temp += counts.get(i);
            answer++;
            
            if (temp >= k) {
                break;
            }
        }
        
        return answer;
    }
}