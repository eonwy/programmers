class Solution {
    public int solution(int n) {
        int answer = 0;
        int bf = 1;
        int af = 1;
        for(int i=1; i<=10; i++){
            bf = bf * i;
            af = bf * (i+1);
            if (n >= bf && n <= af){
                answer = i;
            }
        }
        return answer;
    }
}