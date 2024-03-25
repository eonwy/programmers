import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] answer = new char[my_string.length()];
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch) == true){
                answer[i] = Character.toLowerCase(ch);
            }
            else{
                answer[i] = ch;
            }
        }
        
        Arrays.sort(answer);
        return new String(answer);
    }
}