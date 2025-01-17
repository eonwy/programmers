import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> failure = new HashMap<>();
        
        int totalPlayers = stages.length;
        
        for (int i=1; i<=N; i++) {
            int num = 0;
            
            for (int stage: stages) {
                if (stage == i) {
                    num++;
                }
            }

            if (totalPlayers > 0) {
                failure.put(i, (double) num / totalPlayers);
            } else {
                failure.put(i, 0.0);
            }
            
            totalPlayers -= num;
        }
        
        List<Integer> list = new ArrayList<>(failure.keySet());
        list.sort((o1, o2) -> Double.compare(failure.get(o2), failure.get(o1)));
        System.out.println(failure);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}