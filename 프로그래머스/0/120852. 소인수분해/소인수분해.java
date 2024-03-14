import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList();
        HashSet<Integer> findUnique = new HashSet();
        
        for(int i=2; i<=n; i++){
            while(n%i == 0){
                if(findUnique.add(i)){
                    answerList.add(i);
                }
                n /= i;
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}