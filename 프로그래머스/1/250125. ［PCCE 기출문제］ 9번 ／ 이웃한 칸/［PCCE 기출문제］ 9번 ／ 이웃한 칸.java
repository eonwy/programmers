class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        String color = board[h][w];
        
        for (int i=0; i<dh.length; i++) {
            if ((h+dh[i] >= 0 && h+dh[i] < board.length) && (w+dw[i] >= 0 && w+dw[i] < board.length)) {
                if (board[h+dh[i]][w+dw[i]].equals(color)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}