class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);
        
        for (int i=0; i<words.length; i++) {
            if (!words[i].isEmpty()) {
                char c = Character.toUpperCase(words[i].charAt(0));
                String rest = words[i].substring(1).toLowerCase();
                words[i] = c + rest;
            }
        }
        
        answer = String.join(" ", words);
        return answer;
    }
}