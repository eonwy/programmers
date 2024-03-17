class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++){
            if(Character.isUpperCase(arr[i].charAt(0))){
                answer += Character.toLowerCase(arr[i].charAt(0));
            }
            else{
                answer += Character.toUpperCase(arr[i].charAt(0));
            }
        }
        return answer;
    }
}