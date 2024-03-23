class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] sol = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            sol = quiz[i].split(" ");
            
            int num1 = Integer.parseInt(sol[0]);
            int num2 = Integer.parseInt(sol[2]);
            int result = Integer.parseInt(sol[4]);
            
            if(sol[1].equals("+")){
                if(num1 + num2 == result){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else if(sol[1].equals("-")){
                if(num1 - num2 == result){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}