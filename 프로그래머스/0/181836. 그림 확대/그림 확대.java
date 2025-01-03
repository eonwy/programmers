class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i=0; i<answer.length; i++) {
            StringBuilder temp = new StringBuilder();
            
            for(int j=0; j<picture[i / k].length(); j++) {
                char c = picture[i / k].charAt(j);
                temp.append(String.valueOf(c).repeat(k));
            }
            
            answer[i] = temp.toString();
        }
        
        return answer;
    }
}