class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=3; i<=n; i++){
            int def = 0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    def++;
                }
            }
            if(def > 0){
                answer++;
            }
        }
        
        return answer;
    }
}