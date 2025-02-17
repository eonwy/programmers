class Solution {
    public int solution(int n, int w, int num) {   
        
        if (n == num) {
            return 1;
        }
        
        int maxH = (n - 1) / w + 1;
        int lastH = (n - 1) % w + 1;
        boolean isMaxEven = maxH % 2 == 0;
        
        int numH = (num - 1) / w + 1;
        int lastNumH = (num - 1) % w + 1;
        boolean isNumEven = numH % 2 == 0;
        
        int answer = maxH - numH;
        
        if (isMaxEven == isNumEven) {
            if (lastH >= lastNumH) {
                answer += 1;
            }
        } else {
            if (lastH + lastNumH > w) {
                answer += 1;
            }
        }

        
        return answer;
    }

}