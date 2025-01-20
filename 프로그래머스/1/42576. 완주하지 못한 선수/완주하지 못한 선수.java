import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> temp = new HashMap<>();
        
        for (int i=0; i<participant.length; i++) {
            temp.put(participant[i], temp.getOrDefault(participant[i], 0) + 1);
        }
        
        for (int i=0; i<completion.length; i++) {
            if (temp.containsKey(completion[i])) {
                temp.put(completion[i], temp.get(completion[i]) - 1);
            }
        }
        
        for (int i=0; i<temp.size(); i++) {
            if (temp.get(participant[i]) == 1) {
                answer = participant[i];
            }
        }
        
        return answer;
    }
}