import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Solution sol = new Solution();
        int result = sol.solution(n);
        
        System.out.println(result);
        
        sc.close();
    }
}

class Solution {
    public int solution(int n) {
        return n - 543;
    }
}