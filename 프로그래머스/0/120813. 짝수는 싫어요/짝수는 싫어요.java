class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        if (n%2 == 0){
            n = n-1;
        }
        
        for (int i=1, j=0; i<=n; i+=2, j++){
            answer[j] = i;
        }

        return answer;
    }
}