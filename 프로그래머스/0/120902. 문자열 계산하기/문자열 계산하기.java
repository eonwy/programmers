class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] nums = my_string.split(" ");
        for(int i=0; i<nums.length; i++){
            if(i==0){
                answer += Integer.parseInt(nums[i]);
            }
            
            if(i != 0 && i%2 != 0){
                if(nums[i].equals("+")){
                    answer += Integer.parseInt(nums[i+1]);
                    i++;
                }
                else{
                    answer -= Integer.parseInt(nums[i+1]);
                    i++;
                }
            }
        }
        return answer;
    }
}