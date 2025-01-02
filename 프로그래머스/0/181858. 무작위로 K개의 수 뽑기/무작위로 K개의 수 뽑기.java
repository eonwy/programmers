import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        LinkedHashSet<Integer> findUnique = new LinkedHashSet<>();
        
        for(int num : arr) {
            findUnique.add(num);
        }
        
        List<Integer> uniqueList = new ArrayList<>(findUnique);
        
        if (k <= uniqueList.size()) {
            for(int i=0; i<k; i++) {
                answer[i] = uniqueList.get(i);
            }
        } else {
            int i = 0;
            for(; i<uniqueList.size(); i++) {
                answer[i] = uniqueList.get(i);
            }
            Arrays.fill(answer, i, k, -1);
        }
        
        return answer;
    }
}