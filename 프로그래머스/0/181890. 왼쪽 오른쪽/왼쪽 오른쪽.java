import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int left = -1;
        int right = -1;
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                left = i;
                break;
            } else if(str_list[i].equals("r")) {
                right = i;
                break;
            }
        }
        
        if(left != -1) {
            return Arrays.copyOfRange(str_list, 0, left);
        } else if(right != -1) {
            return Arrays.copyOfRange(str_list, right+1, str_list.length);
        }
        
        return new String[0];
    }
}