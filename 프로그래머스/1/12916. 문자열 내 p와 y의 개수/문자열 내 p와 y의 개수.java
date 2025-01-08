class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();
            
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }

        return p == y ? true : p == 0 && y == 0 ? true : false;
    }
}