import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0; 
        int y = 0;
        int bx = board[0];
        int by = board[1];
        
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                x -= 1;
            }
            else if(keyinput[i].equals("right")){
                x += 1;
            }
            else if(keyinput[i].equals("down")){
                y -= 1;
            }
            else if(keyinput[i].equals("up")){
                y += 1;
            }
            if(Math.abs(x) > bx / 2){
                if(x < 0){
                    x = -(bx / 2);
                }
                else{
                    x = bx / 2;
                }
            }
            if(Math.abs(y) > by / 2){
                if(y < 0){
                    y = -(by / 2);
                }
                else{
                    y = by / 2;
                }
            }
        }
        
        int[] answer = new int[]{x, y};
        return answer;
    }
}