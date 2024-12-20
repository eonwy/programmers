import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }
}