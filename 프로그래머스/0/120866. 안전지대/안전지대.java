import java.util.*;

class Solution {
    public int solution(int[][] board) {
        ArrayList<int[]> mine = new ArrayList<>();
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
        int answer = 0;
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    int[] temp = {i, j};
                    mine.add(temp);
                }
            }
        }
        
        for(int z=0; z<mine.size(); z++){
            int i = mine.get(z)[0];
            int j = mine.get(z)[1];
            for(int v=0; v<8; v++){
                if(dx[v]+i >= 0 && dy[v]+j >= 0 && dx[v]+i <= board.length-1 && dy[v]+j <= board.length-1){
                    board[dx[v]+i][dy[v]+j] = 1;
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}