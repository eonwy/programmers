import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        Solution sol = new Solution();
        int result = sol.solution(a);
        
        System.out.println(result);
        
        sc.close();
    }
}

class Solution {
    public int solution(int a) {
        boolean isLeap = false;
        
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            isLeap = true;
        }
        
        return isLeap ? 1 : 0;
    }
}