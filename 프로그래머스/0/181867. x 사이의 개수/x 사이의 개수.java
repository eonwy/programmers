import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String[] splited = myString.split("x");
        
        for(int i=0; i<splited.length; i++) {
            answer.add(splited[i].length());
        }
        
        if(myString.endsWith("x")) {
            answer.add(0);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}