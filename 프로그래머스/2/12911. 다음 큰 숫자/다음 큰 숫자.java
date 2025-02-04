class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binaryN = Integer.toBinaryString(n);
        int binaryNOneCount = 0;
        for (int i=0; i<binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') binaryNOneCount++;
        }
        
        int binaryBigOneCount = 0;
        while (binaryNOneCount != binaryBigOneCount) {
            binaryBigOneCount = 0;
            int big = ++n;
            String binaryBig = Integer.toBinaryString(big);
            for (int i=0; i<binaryBig.length(); i++) {
                if (binaryBig.charAt(i) == '1') binaryBigOneCount++;
            }
            answer = big;
        }
        
        return answer;
    }
}