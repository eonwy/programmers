class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int total_len = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        int pos_len = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int start_len = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int end_len = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);
        
        if (pos_len >= start_len && pos_len <= end_len) {
            pos_len = end_len;
        }
        
        for (int i = 0; i < commands.length; i++) {            
            if (commands[i].equals("next")) {
                pos_len += 10;
            } else if (commands[i].equals("prev")) {
                pos_len -= 10;
            }
            
            if (pos_len <= 0) {
                pos_len = 0;
            } else if (pos_len >= total_len) {
                pos_len = total_len;
            }
            
            if (pos_len >= start_len && pos_len <= end_len) {
                pos_len = end_len;
            } 
        }
        
        answer = String.format("%02d:%02d", pos_len / 60, pos_len % 60);
        
        return answer;
    }
}