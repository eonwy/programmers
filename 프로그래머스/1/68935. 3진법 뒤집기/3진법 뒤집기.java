class Solution {
    public int solution(int n) {
        StringBuilder temp = new StringBuilder();
        
        while (n > 0) {
            temp.append(n % 3);
            n /= 3;
        }
        
        int toInt = 0;
        toInt = Integer.parseInt(temp.toString(), 3);
        
        return toInt;
    }
}