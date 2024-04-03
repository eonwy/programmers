import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int result = 0;
        
        Arrays.sort(spell);
        String newSpell = "";
        
        for(int i=0; i<spell.length; i++){
            newSpell += spell[i];
        }
        
        for(int i=0; i<dic.length; i++){
            char[] dicChar = dic[i].toCharArray();
            Arrays.sort(dicChar);
            String sortedDicChar = new String(dicChar);
            if(sortedDicChar.equals(newSpell)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}