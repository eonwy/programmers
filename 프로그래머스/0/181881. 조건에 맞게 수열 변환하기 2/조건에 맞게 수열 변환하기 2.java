class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean changed = true;
        
        while(changed) {
            changed = false;
            
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    changed = true;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    changed = true;
                }
            }
            
            if(changed) {
                answer++;
            }
            
            
        }
        
        return answer;
    }
}