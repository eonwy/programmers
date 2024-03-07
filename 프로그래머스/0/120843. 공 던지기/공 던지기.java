class Solution {
    public int solution(int[] numbers, int k) {
        
        int z = 0 + (k-1)*2;
        int j = z % numbers.length;
        
        return numbers[j];
    }
}