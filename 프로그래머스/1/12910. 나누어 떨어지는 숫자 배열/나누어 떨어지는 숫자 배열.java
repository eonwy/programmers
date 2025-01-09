import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<>();
        
        for(int num : arr) {
            if(num % divisor == 0) {
                temp.add(num);
            }
        }
        
        if(temp.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] answer = temp.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}