import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        StringBuilder answerBuilder = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                answerBuilder.append(c);
            }
        }
        
        String answerString = answerBuilder.toString();
        int[] answer = new int[answerString.length()];
        for(int i=0; i<answerString.length(); i++){
            answer[i] = Character.getNumericValue(answerString.charAt(i));
        }
        
        Arrays.sort(answer);
        return answer;
    }
}