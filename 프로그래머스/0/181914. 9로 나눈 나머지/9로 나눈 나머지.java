class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char s : number.toCharArray()) {
            answer += s - '0';
        }
        
        return answer % 9;
    }
}