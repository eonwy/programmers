import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        
        int max = 1;
        int maxNum = array[0];
        int count = 1;
        boolean dup = false;
        
        Arrays.sort(array);
        
        for (int i=0; i<array.length-1; i++){
            if (array[i] == array[i+1]){
                count++;
                if (count > max){
                    max = count;
                    maxNum = array[i];
                    dup = true;
                }
                else if (count == max){
                    maxNum = -1;
                    dup = false;
                }
                
            }
            else {
                count = 1;
            }
        }
        
        return dup ? maxNum : -1;
    }
}