import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> score = new HashMap<>();
        
        for (int i=0; i<choices.length; i++) {
            if (choices[i] < 4) {
                score.put(survey[i].charAt(0), score.getOrDefault(survey[i].charAt(0), 0) + (4 - choices[i]));
            } else if (choices[i] > 4) {
                score.put(survey[i].charAt(1), score.getOrDefault(survey[i].charAt(1), 0) + (choices[i] - 4));
            }
        }
        
        answer += (score.getOrDefault('R', 0) >= score.getOrDefault('T', 0)) ? 'R' : 'T';
        answer += (score.getOrDefault('C', 0) >= score.getOrDefault('F', 0)) ? 'C' : 'F';
        answer += (score.getOrDefault('J', 0) >= score.getOrDefault('M', 0)) ? 'J' : 'M';
        answer += (score.getOrDefault('A', 0) >= score.getOrDefault('N', 0)) ? 'A' : 'N';
        
        return answer;
    }
}