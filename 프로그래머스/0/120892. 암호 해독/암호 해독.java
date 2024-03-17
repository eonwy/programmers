class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] arr = cipher.split("");
        
        for(int i=0; i<arr.length; i++){
            if((i+1) % code == 0){
                answer.append(arr[i]);
            }
        }
        
        return answer.toString();
    }
}