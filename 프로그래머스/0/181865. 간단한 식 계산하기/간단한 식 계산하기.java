class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] temp;
        
        temp = binomial.split(" ");
        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[2]);
        
        switch (temp[1]) {
            case "+":
                answer = num1 + num2;
                break;
            case "-":
                answer = num1 - num2;
                break;
            case "*":
                answer = num1 * num2;
                break;
        }
        
        return answer;
    }
}