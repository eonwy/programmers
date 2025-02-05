class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int len = arr.length;
        
        if (len >= 2) {
            for (int i=0; i<len - 1; i++) {
                
                int maxNum = 1;
                
                for (int j=1; j<=arr[i]; j++) {
                    if (arr[i] % j == 0 && arr[i+1] % j == 0 && i < len - 1) {
                        maxNum = j;
                    }
                }
                
                arr[i+1] = (arr[i] * arr[i+1]) / maxNum;
            }
        }

        return arr[len-1];
    }
}