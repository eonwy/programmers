class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int withX = 0;
        int just = 0;
        
        String[] result = polynomial.split(" ");
        
        for(int i=0; i<result.length; i++){
            if(result[i].contains("x")){
                if(result[i].equals("x")){
                    withX += 1;
                } else {
                    result[i] = result[i].replace("x", "");
                    int num = Integer.parseInt(result[i]);
                    withX += num;
                }
            }
            else if(!result[i].equals("+")){
                int num = Integer.parseInt(result[i]);
                just += num;
            }
        }
        
        if(withX == 1){
            if(just == 0){
                answer = "x";
            }
            else if(just != 0){
                answer = "x + " + just;
            }
        }
        else if(withX == 0){
            if(just == 0){
                answer = "0";
            }
            else if(just != 0){
                answer = Integer.toString(just);
            }
        }
        else if(withX != 0 && withX != 1){
            if(just == 0){
                answer = withX + "x";
            }
            else if(just != 0){
                answer = withX + "x + " + just;
            }
        }
        return answer;
    }
}