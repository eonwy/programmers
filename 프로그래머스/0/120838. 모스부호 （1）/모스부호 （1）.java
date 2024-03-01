class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        String[] morseLetter = letter.split(" ");
        
        for(String ml:morseLetter){
            for(int i=0; i<morse.length; i++){
                if(ml.equals(morse[i])){
                    answer.append((char)(i+'a'));
                }
            }
        }
        
        return answer.toString();
    }
}