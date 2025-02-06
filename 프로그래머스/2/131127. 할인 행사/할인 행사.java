import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wishlist = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wishlist.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length - 10 + 1; i++) {
            Map<String, Integer> temp = new HashMap<>();
            
            for (int j = i; j < i + 10; j++) {
                temp.put(discount[j], temp.getOrDefault(discount[j], 0) + 1);
            }
            
            boolean isAnswer = true;
            
            for (String key : wishlist.keySet()) {
                if (wishlist.get(key) != temp.get(key)) {
                    isAnswer = false;
                    break;
                }
            }
            
            if (isAnswer) {
                answer++;
            }
            
        }
        
        return answer;
    }
}