import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        HashMap<Integer, Integer> dice = new HashMap<>();
        
        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
        
        List<Integer> keys = new ArrayList<>(dice.keySet());
        int size = dice.size();
        
        if (size == 1) {
            answer = a * 1111;
        } else if (size == 2) {
            if (dice.containsValue(3)) {
                int oneNum = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                int threeNum = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                answer = (int) Math.pow((10 * threeNum) + oneNum, 2);
            } else {
                answer = (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
            }
        } else if (size == 3) {
            for(int k : keys) {
                if(dice.get(k) == 1) {
                    answer *= k;
                }
            }
        } else {
            Collections.sort(keys);
            answer = keys.get(0);
        }
            
        return answer;
    }
}