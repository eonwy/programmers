import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        Solution sol = new Solution();
        String result = sol.solution(a);
        
        System.out.println(result);
        
        sc.close();
    }
}

class Solution {
    public String solution(int a) {
        if (a >= 90) {
            return "A";
        } else if (a >= 80 && a <= 89) {
            return "B";
        } else if (a >= 70 && a <= 79) {
            return "C";
        } else if (a >= 60 && a <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
}