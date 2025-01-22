class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = num;
            } else {
                if (num == 0) num = 11;
                
                int leftDiff = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                int rightDiff = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;
                
                if (leftDiff < rightDiff) {
                    answer += "L";
                    left = num;
                } else if (leftDiff > rightDiff) {
                    answer += "R";
                    right = num;
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = num;
                    } else {
                        answer += "L";
                        left = num;
                    }
                }
                
            }
        }

        return answer;
    }
}