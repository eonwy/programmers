class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i=idx; i<arr.length; i++) {
            if (arr[i] > 0) {
                answer = i;
                return answer;
            }
        }
        
        return answer;
    }
}