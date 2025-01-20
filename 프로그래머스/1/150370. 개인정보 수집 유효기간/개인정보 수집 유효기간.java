import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, String> termMap = new HashMap<>();
        for (int i=0; i<terms.length; i++){
            termMap.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }
        
        List<Integer> answer = new ArrayList<>();
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        for (int i=0; i<privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int term = Integer.parseInt(termMap.get(privacies[i].split(" ")[1]))*28;
            
            int expire = (year - Integer.parseInt(date.split("\\.")[0]))*12*28
                        + (month - Integer.parseInt(date.split("\\.")[1]))*28
                        + (day - Integer.parseInt(date.split("\\.")[2]));
            
            if (expire >= term) answer.add(i+1);
            
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}