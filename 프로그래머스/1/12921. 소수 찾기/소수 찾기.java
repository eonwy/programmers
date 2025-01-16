class Solution {
    public int solution(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        int answer = n - 1;
        
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    if (!isNotPrime[j]) {
                        isNotPrime[j] = true;
                        answer--;
                    }
                }
            }
        }

        return answer;
    }
}