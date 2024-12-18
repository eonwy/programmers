import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(String s : strArr) {
            if(!s.contains("ad")) {
                answer.add(s);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}