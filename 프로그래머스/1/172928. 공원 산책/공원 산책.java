class Solution {
    public int[] solution(String[] park, String[] routes) {
        int Sx = 0;
        int Sy = 0;
        
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    Sy = i;
                    Sx = j;
                }
            } 
        }
        
        for (int i=0; i<routes.length; i++) {
            String direction = routes[i].split(" ")[0];
            int many = Integer.parseInt(routes[i].split(" ")[1]);
            int nx = Sx;
            int ny = Sy;
            
            boolean isValid = true;
            
            for (int j=0; j<many; j++) {
                
                if (direction.equals("E")) {
                    nx++;
                } else if (direction.equals("S")) {
                    ny++;
                } else if (direction.equals("W")) {
                    nx--;
                } else if (direction.equals("N")) {
                    ny--;
                }
                
                if (ny < 0 || ny >= park.length || nx < 0 || nx >= park[0].length() || park[ny].charAt(nx) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                Sx = nx;
                Sy = ny;
            }
        }
        
        return new int[] {Sy, Sx};
    }
}