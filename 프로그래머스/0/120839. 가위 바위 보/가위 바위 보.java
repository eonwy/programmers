class Solution {
    public String solution(String rsp) {
        
        String answer = "";
        
        for(int i=0; i<rsp.length(); i++){
            char current = rsp.charAt(i);
            if(current == '2'){
                answer += '0';
            }
            else if(current == '0'){
                answer += '5';
            }
            else if(current == '5'){
                answer += '2';
            }
        }
        
        return answer;
    }
}