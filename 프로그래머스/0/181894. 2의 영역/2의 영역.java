import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int first = -1;
        int last = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                first = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == 2) {
                last = i;
                break;
            }
        }
        
        if(first == -1 || last == -1) {
            answer.add(-1);
        } else {
            for(int i=first; i<last+1; i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}