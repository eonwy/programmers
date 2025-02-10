class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i] % 100 >= 50) {
                schedules[i] += 50;
            } else if (schedules[i] == 950) {
                schedules[i] = 1000;
            }
            else {
                schedules[i] += 10;
            }
        }
        
        for (int i = 0; i < timelogs.length; i++) {
            boolean isOkay = true;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                int dayOfWeek = (startday + j) % 7;
                
                if (dayOfWeek >= 1 && dayOfWeek <= 5) {
                    
                    if (timelogs[i][j] > schedules[i]) {
                        isOkay = false;
                        break;
                    }
                }
            }
            
            if (isOkay) answer++;
        }
        
        return answer;
    }
}