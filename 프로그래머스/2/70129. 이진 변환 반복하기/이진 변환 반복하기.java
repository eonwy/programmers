class Solution {
    public int[] solution(String s) {
        int times = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            int onesCount = 0;
        
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    onesCount++;
                } else {
                    zeroCount++;
                }
            }
            
            s = Integer.toBinaryString(onesCount);
            
            times++;
        }
        
        return new int[]{times, zeroCount};
    }
}