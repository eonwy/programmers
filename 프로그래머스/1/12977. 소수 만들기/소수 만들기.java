class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean isSosu = false;

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int z=j+1; z<nums.length; z++) {
                    int num = nums[i] + nums[j] + nums[z];
                    
                    if (num >= 2) {
                        isSosu = sosu(num);
                    }
                    
                    if (isSosu) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean sosu(int num) {
        boolean isSosu = true;
        
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                isSosu = false;
                break;
            }
        }
        
        return isSosu;
    }
}