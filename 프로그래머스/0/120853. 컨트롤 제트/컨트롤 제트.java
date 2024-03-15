class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        for(int i=0; i<list.length; i++){
            if("Z".equals(list[i])){
                list[i-1] = "0";
                list[i] = "0";
            }
        }
        
        for(int i=0; i<list.length; i++){
            answer += Integer.parseInt(list[i]);
        }
        
        return answer;
    }
}