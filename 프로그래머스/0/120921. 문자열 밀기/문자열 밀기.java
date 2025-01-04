class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        for(int i=0; i<A.length(); i++) {
            
            String temp = "";
            
            temp = A.substring(i, A.length());
            
            if(i != 0) {
                temp = A.substring(i, A.length()) + A.substring(0, i);
            }
            
            if(temp.equals(B) && i != 0) {
                answer = A.length() - i;
            } else if (temp.equals(B) && i == 0) {
                answer = 0;
            }
        }
        
        return answer;
    }
}