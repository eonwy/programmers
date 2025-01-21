class Solution {
    public int solution(String s) {
        int answer = 0;
        char firstChar = s.charAt(0);
        int count = 0;
        
        for (int i=0; i<s.length(); i++) {
            char numChar = s.charAt(i);
            
            if (firstChar == numChar) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0 || i == s.length()-1) {
                answer++;
                if (i+1 < s.length()) {
                    firstChar = s.charAt(i+1);
                }
            }
        }
        
        return answer;
    }
}