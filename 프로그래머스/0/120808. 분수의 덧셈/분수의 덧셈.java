class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int max = 0;
        
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        
        for (int i=1; i<=denom && i<=numer; i++){
            if(numer%i ==0 && denom%i==0){
                max = i;
            }
        }
        numer = numer/max;
        denom = denom/max;
        
        answer = new int[]{numer, denom};
        
        return answer;
    }
}