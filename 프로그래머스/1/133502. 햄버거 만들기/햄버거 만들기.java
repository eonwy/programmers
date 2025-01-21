import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<>();
        
        for (int i=0; i<ingredient.length; i++) {
            hamburger.push(ingredient[i]);
            
            if (hamburger.size() >= 4) {
                int size = hamburger.size();
                
                if (hamburger.get(size - 4) == 1 &&
                    hamburger.get(size - 3) == 2 &&
                    hamburger.get(size - 2) == 3 &&
                    hamburger.get(size - 1) == 1) {
                    
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    
                    answer++;
                }
            }
        }
        
        return answer;
    }
}