class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for(int i=0; i<code.length(); i++) {
            char c = code.charAt(i);
            
            if (c == '1') {
                mode = !mode;
            } else if (mode && i%2 != 0) {
                answer += String.valueOf(c);
            } else if(!mode && i%2 == 0) {
                answer += String.valueOf(c);
            }
            
        }
        
        if(answer.isEmpty()) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}