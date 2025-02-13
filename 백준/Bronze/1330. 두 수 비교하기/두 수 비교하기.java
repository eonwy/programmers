import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Solution sol = new Solution();
        String result = sol.solution(a, b);
        
        System.out.println(result);
        
        sc.close();
    }
}

class Solution {
    public String solution(int a, int b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else {
            return "==";
        }
    }
}