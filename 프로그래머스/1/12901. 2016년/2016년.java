class Solution {
    public String solution(int a, int b) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int count = -1;
        
        for (int i=0; i<a-1; i++) {
            count += months[i];
        }
        
        return days[(count+b) % 7];
    }
}