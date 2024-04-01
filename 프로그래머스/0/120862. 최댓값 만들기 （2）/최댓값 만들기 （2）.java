import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i != j){
                    answer.add(numbers[i] * numbers[j]);
                }
            }
        }
        Collections.sort(answer);
        return answer.get(answer.size() - 1);
    }
}