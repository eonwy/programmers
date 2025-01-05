class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        int item = 0;
        
        for(int i=0; i<num; i++) {
            item += i;
        }
        
        start = (total - item) / num;
        
        for(int i=0; i<num; i++) {
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}