class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        
        if(my_str.length() % n != 0){
            length = my_str.length() / n + 1;
        }
        else{
            length = my_str.length() / n;
        }
        
        String[] answer = new String[length];
        
        for(int i=0; i<length; i++){
            if(my_str.length() >= n){
                answer[i] = my_str.substring(0, n);
                my_str = my_str.substring(n, my_str.length());
            }
            else{
                answer[i] = my_str;
            }
        }
        return answer;
    }
}