class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        
        double incl1 = (double) (y1 - y4) / (x1 - x4);
        double incl2 = (double) (y2 - y3) / (x2 - x3);
        if(incl1 == incl2){
            answer = 1;
        }
        
        double incl3 = (double) (y1 - y3) / (x1 - x3);
        double incl4 = (double) (y2 - y4) / (x2 - x4);
        if(incl3 == incl4){
            answer = 1;
        }
        
        double incl5 = (double) (y1 - y2) / (x1 - x2);
        double incl6 = (double) (y3 - y4) / (x3 - x4);
        if(incl5 == incl6){
            answer = 1;
        }
        
        return answer;
    }
}