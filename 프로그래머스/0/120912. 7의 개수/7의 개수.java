import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        LinkedList<Integer> result = new LinkedList<>();
        for(int i=0; i<array.length; i++){
            while(array[i]>0){
                result.push(array[i]%10);
                array[i] /= 10;
            }
        }
        
        for(int i=0; i<result.size(); i++){
            if(result.get(i) == 7){
                answer++;
            }
        }
        
        return answer;
    }
}