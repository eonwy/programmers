import java.util.*;

class Solution {
    public String solution(String s) {
        
        String[] sArr = s.split(" ");
        int[] temp = new int[sArr.length];
        
        for (int i=0; i<temp.length; i++) {
            temp[i] = Integer.parseInt(sArr[i]);
        }
        
        int max = temp[0];
        int min = temp[0];
        
        for (int i=0; i<temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            } else if (min > temp[i]) {
                min = temp[i];
            }
         }
        
        return min + " " + max;
    }
}