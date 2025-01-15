class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            for (int j=i; j>=0; j--) {
                if (c == s.charAt(j) && i != j) {
                    answer[i] = i - j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}