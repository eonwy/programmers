class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++) {
            if (n == num_list.length) n = 0;
            answer[i] = num_list[n];
            n = (n + 1) % num_list.length;
        }
        
        return answer;
    }
}