class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}