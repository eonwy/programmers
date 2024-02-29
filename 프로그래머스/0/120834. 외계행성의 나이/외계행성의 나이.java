class Solution {
    public String solution(int age) {
        
        String answer = "";
        String[] sol = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] ageArr = Integer.toString(age).split("");
        
        for(int i=0; i<ageArr.length; i++){
            int index = Integer.parseInt(ageArr[i]);
            answer += sol[index];
        }
        
        return answer;
    }
}