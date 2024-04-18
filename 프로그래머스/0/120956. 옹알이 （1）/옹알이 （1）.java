
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] inventory = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<inventory.length; j++){
                if(babbling[i].contains(inventory[j])){
                    babbling[i] = babbling[i].replace(inventory[j], "!");
                }
            }
        }
        
        for(int i=0; i<babbling.length; i++){
            boolean allZ = true;
            for(char c:babbling[i].toCharArray()){
                if(c != '!'){
                    allZ = false;
                    break;
                }
            }
            if(allZ){
                answer++;
            }
        }
        return answer;
    }
}