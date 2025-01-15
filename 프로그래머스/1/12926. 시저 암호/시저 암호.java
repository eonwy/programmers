class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c + n - 'a') % 26);
            } else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c + n - 'A') % 26);
            }
            
            answer.append(c);
        }
        
        return answer.toString();
    }
}