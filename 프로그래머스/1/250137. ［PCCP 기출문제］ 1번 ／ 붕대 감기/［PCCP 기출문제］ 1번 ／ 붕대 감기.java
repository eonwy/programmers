class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int now = health - attacks[0][1];
        
        for (int i=1; i<attacks.length; i++) {

            if (now <= 0) break;
            
            now += (attacks[i][0] - attacks[i-1][0] - 1) * bandage[1];
            now += ((attacks[i][0] - attacks[i-1][0] - 1) / bandage[0]) * bandage[2];
            now = now > health ? health : now;
            
            now -= attacks[i][1];
        }

        return now <= 0 ? -1 : now;
    }
}