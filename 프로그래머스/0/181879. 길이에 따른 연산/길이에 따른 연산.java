class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length <= 10 ? 1 : 0;
        
        for(int num : num_list) {
            if(num_list.length <= 10) {
                answer *= num;
            } else {
                answer += num;
            }
        }
        
        return answer;
    }
}