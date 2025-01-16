import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> findUnique = new HashSet<>();
        
        for (int i=0; i<nums.length; i++) {
            findUnique.add(nums[i]);
        }
        
        return Math.min(findUnique.size(), nums.length/2);
    }
}