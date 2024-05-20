class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int binOne = Integer.parseInt(bin1, 2);
        int binTwo = Integer.parseInt(bin2, 2);
        
        int sum = binOne + binTwo;
        
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}