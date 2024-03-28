import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        Arrays.sort(dots, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        answer = (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[0][1]);
        return answer;
    }
}