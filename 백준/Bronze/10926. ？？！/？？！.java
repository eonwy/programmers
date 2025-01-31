import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        Solution sol = new Solution();
        String result = sol.solution(s);
        
        System.out.println(result);
        
        sc.close();
    }
}

class Solution {
    public String solution(String s) {
        return s + "??!";
    }
}