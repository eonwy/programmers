import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String r : report) {
            String[] splitData = r.split(" ");
            String reporter = splitData[0];
            String reportee = splitData[1];
            
            reportMap.putIfAbsent(reportee, new HashSet<>());
            reportMap.get(reportee).add(reporter);
        }
        
        Map<String, Integer> mailCount = new HashMap<>();
        for (String reportee : reportMap.keySet()) {
            Set<String> reporters = reportMap.get(reportee);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
                }
            }
        }
        
        for (int i=0; i<id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}