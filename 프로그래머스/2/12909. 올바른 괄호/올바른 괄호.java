import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> parentheses = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                parentheses.push(c);
            } else if (c == ')') {
                if (parentheses.isEmpty()) {
                    return false;
                }
                parentheses.pop();
            }
        }
        
        if (parentheses.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}