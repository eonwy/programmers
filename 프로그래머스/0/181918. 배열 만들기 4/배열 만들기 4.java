import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int index = 0;
        
        while(index < arr.length) {
            if(stk.size() == 0) {
                stk.add(arr[index]);
                index++;
            } else if(stk.get(stk.size() - 1) < arr[index]) {
                stk.add(arr[index]);
                index++;
            } else if(stk.get(stk.size() - 1) >= arr[index]) {
                stk.remove(stk.size() - 1);
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}