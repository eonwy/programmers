import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int array_length = array.length;
        Arrays.sort(array);
        
        if (array_length % 2 == 1){
            answer = array[array_length / 2];
        }
        
        return answer;
    }
}