import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        List<Integer> temp = new ArrayList<>();
        
        int[][] dp = new int[park.length][park[0].length];
        for (int i=0; i<dp.length; i++) {
            for (int j=0; j<dp[0].length; j++) {
                if (park[i][j].equals("-1")) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        for (int i=1; i<dp.length; i++) {
            for (int j=1; j<dp[0].length; j++) {
                if (dp[i][j] == 0) continue;
                
                dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                temp.add(dp[i][j]);
            }
        }
        
        int max = -1;
        for (int m : mats) {
            if (temp.contains(m)) {
                max = Math.max(m, max);
            }
        }
        
        return max;
    }
}