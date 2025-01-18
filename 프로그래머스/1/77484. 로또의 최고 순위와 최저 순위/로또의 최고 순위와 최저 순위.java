class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int len = lottos.length;
        int possible = 0;
        int zero = 0;
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (lottos[i] == win_nums[j]) {
                    possible++;
                }
            }
            
            if (lottos[i] == 0) {
                zero++;
            }
        }
        
        return new int[]{len+1-(possible+zero) < 7 ? len+1-(possible+zero) : 6, len+1-possible < 7 ? len+1-possible : 6};
    }
}