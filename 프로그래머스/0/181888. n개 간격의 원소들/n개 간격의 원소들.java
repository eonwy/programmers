import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> tempList = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                tempList.add(num_list[i]);
            }
        }

        return tempList.stream().mapToInt(Integer::intValue).toArray();
    }
}