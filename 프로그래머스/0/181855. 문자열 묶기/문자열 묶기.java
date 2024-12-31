import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxLength = 0;
        
        for(int i=0; i<strArr.length; i++) {
            if(maxLength < strArr[i].length()) {
                maxLength = strArr[i].length();
            }
        }
        
        int[] temp = new int[maxLength + 1];
        
        for(int i=0; i<strArr.length; i++) {
            temp[strArr[i].length()]++;
        }
        
        for(int i=0; i<temp.length; i++) {
            if(answer < temp[i]) {
                answer = temp[i];
            }
        }
        
        return answer;
    }
}