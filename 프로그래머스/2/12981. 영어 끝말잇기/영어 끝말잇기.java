import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> temp = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            
            // 이전에 등장했던 단어인 경우
            if (temp.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            temp.add(words[i]);
            
            // 끝말을 잇지 않은 경우
            if (i > 0 && words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer[0] == 0 ? new int[] {0, 0} : answer;
    }
}