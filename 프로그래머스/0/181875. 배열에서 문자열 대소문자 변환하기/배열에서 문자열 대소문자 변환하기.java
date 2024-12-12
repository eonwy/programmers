class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int i = 0;
        
        for(String s : strArr){
            if(i % 2 == 0){
                answer[i] = s.toLowerCase();
            } else {
                answer[i] = s.toUpperCase();
            }
            i++;
        }
        return answer;
    }
}