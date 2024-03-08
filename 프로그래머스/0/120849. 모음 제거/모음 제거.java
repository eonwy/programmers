class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] except = new String[] {"a", "e", "i", "o", "u"};
        
        for(int i=0; i<my_string.length(); i++){
            int vowel = 0;
            
            for(int j=0; j<except.length; j++){
                if(String.valueOf(my_string.charAt(i)).equals(except[j])){
                    vowel++;
                }
            }
            
            if(vowel == 0){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}