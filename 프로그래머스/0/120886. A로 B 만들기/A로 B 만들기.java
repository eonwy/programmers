import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArray =  before.toCharArray();
        Arrays.sort(beforeArray);
        char[] afterArray =  after.toCharArray();
        Arrays.sort(afterArray);
        
        String beforeString = new String(beforeArray);
        String afterString = new String(afterArray);
        
        if(beforeString.equals(afterString)){
            answer = 1;
        }
        
        return answer;
    }
}