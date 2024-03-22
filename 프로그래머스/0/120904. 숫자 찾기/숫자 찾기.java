class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String number = Integer.toString(num);
        
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == (char)(k+'0')){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}