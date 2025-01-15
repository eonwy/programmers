import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> findUnique = new HashSet();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                findUnique.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> answer = new ArrayList<>(findUnique);
        Collections.sort(answer);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}