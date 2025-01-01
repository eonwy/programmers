import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] alphabet = new int[52];
        
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(c >= 'A' && c <= 'Z') {
                alphabet[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a' + 26]++;
            }
        }
        
        return alphabet;
    }
}