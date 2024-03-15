import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        LinkedHashSet<Character> deer = new LinkedHashSet<>();
        for(int i=0; i<my_string.length(); i++){
            deer.add(my_string.charAt(i));
        }
        
        StringBuilder answer = new StringBuilder();
        for(char c:deer){
            answer.append(c);
        }
        return answer.toString();
    }
}