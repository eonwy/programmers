class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = 0;
        
        while(n <= myString.length() - pat.length()) {
            String temp = myString.substring(n, n + pat.length());
            if(temp.equals(pat)) {
                answer++;
            }
            n++;
            
        }
            
        return answer;
    }
}