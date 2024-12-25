class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i <= my_string.length() - m; i += m) {
            String temp = my_string.substring(i, i + m);
            
            if(c <= temp.length()) {
                answer += temp.charAt(c-1);
            }
        }
        
        return answer;
    }
}