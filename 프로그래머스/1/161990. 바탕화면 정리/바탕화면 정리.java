class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int Maxh = 0;
        int Minh = wallpaper.length;
        int Maxw = 0;
        int Minw = wallpaper[0].length();
        
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j<wallpaper[i].length(); j++) {
                char c = wallpaper[i].charAt(j);
                
                if (c == '#') {
                    if (Maxh < i) {
                        Maxh = i;
                    }
                    if (Minh > i) {
                        Minh = i;
                    }
                    if (Maxw < j) {
                        Maxw = j;
                    }
                    if (Minw > j) {
                        Minw = j;
                    }
                }
            }
        }
        
        return new int[]{Minh, Minw, Maxh+1, Maxw+1};
    }
}