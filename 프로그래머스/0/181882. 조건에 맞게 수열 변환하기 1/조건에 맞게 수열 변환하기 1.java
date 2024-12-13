import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int n : arr) {
            if (n % 2 == 0 && n >= 50) {
                answer.add(n / 2);
            } else if (n % 2 != 0 && n < 50) {
                answer.add(n * 2);
            } else {
                answer.add(n);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}