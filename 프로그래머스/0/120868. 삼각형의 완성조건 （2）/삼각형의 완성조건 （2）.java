import java.util.*;

class Solution {
    public int solution(int[] sides) {

        int add = sides[0] + sides[1];
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        HashSet<Integer> result = new HashSet<Integer>();
        
        for(int i=1; i<=max; i++){
            if(min+i > max){
                result.add(i);
            }
        }
        
        for(int i=max; i<add; i++){
            if(add > i && i > max){
                result.add(i);
            }
        }
        return result.size();
    }
}