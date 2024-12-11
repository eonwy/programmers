class Solution {
    public int solution(int a, int b) {
        int origin = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int reverse = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        return origin > reverse ? origin : reverse;
    }
}