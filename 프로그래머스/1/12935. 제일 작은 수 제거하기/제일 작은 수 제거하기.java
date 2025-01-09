import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != min) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}