import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i=0; i<photo.length; i++) {
            int temp = 0;
            
            for (int j=0; j<photo[i].length; j++) {
                
                for (int z=0; z<name.length; z++) {
                    
                    if (photo[i][j].equals(name[z])) {
                        temp += yearning[z];
                    }
                }
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}