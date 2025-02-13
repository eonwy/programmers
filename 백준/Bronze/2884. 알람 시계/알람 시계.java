import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Solution sol = new Solution();
        
        System.out.println(sol.solution(a, b));
        
        sc.close();
    }
}

class Solution {
    public String solution(int a, int b) {
        if (b < 45) {
            if (a == 0) {
                a = 23;
            } else {
                a -= 1;
            }
            
            b += 15;
        } else {
            b -= 45;
        }
        
        return a + " " + b;
    }
}