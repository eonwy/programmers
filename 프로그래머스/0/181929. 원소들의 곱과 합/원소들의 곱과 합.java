class Solution {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer2 = 0;
        
        for(int n : num_list) {
            answer1 *= n;
            answer2 += n;
        }
        
        answer2 = (int) Math.pow(answer2, 2);
        
        return answer1 < answer2 ? 1 : 0;
    }
}