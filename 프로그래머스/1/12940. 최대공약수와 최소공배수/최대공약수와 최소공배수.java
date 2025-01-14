class Solution {
    public int[] solution(int n, int m) {
        int maxNum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                maxNum = i;
            }
        }
        
        return new int[]{maxNum, n*m/maxNum};
    }
}