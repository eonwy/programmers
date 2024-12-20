class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            for(int i=0; i<arr1.length; i++) {
                answer += arr1[i];
                answer -= arr2[i];
            }
            answer = answer > 0 ? 1 : answer == 0 ? 0 : -1; 
        }

        return answer;
    }
}