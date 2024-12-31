import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        
        for(int i=0; i<myStr.length(); i++) {
            char c = myStr.charAt(i);
            
            if(c != 'a' && c != 'b' && c != 'c') {
                temp.append(c);
            } else {
                if(temp.length() > 0) {
                    answer.add(temp.toString());
                    temp.setLength(0);
                }
            }
        }
        
        if(temp.length() > 0) {
            answer.add(temp.toString());
        }
        
        if(answer.size() == 0) {
            return new String[]{"EMPTY"};
        }
        
        return answer.toArray(new String[0]);
    }
}