class Solution {
    public int solution(int a, int b) {
        String calculate = a + "" + b;
        return Math.max(Integer.parseInt(calculate), 2*a*b);
    }
}