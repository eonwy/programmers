import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>(); 
        
        for(int n : arr) {
            if (answer.empty() || answer.peek() != n) {
                answer.push(n);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}