class Solution {
    public boolean solution(int x) {
        int temp = x;
        int n = 0;
        
        for(int i=0; i<String.valueOf(x).length(); i++) {
            n += temp % 10;
            temp /= 10;
        }
        
        return x % n == 0 ? true : false;
    }
}