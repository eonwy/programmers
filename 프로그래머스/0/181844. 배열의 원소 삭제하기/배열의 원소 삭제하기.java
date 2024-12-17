import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        int exceptNum = -1;
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    exceptNum = i;
                }
            }
            
            if(exceptNum < 0){
                answer.add(arr[i]);
            }
            
            exceptNum = -1;
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}