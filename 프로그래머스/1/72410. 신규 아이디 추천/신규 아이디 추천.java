class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        StringBuilder filtered = new StringBuilder();
        for (int i=0; i<new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (c == '-' || c == '_' || c == '.' || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                filtered.append(c);
            }
        }
        
        // 3단계
        String processed = filtered.toString().replaceAll("\\.+", ".");
        
        // 4단계
        if (processed.startsWith(".")) {
            processed = processed.substring(1);
        }
        if (processed.endsWith(".")) {
            processed = processed.substring(0, processed.length() - 1);
        }
        
        // 5단계
        if (processed.isEmpty()) {
            processed = "a";
        } 
        
        // 6단계
        if (processed.length() > 15) {
            processed = processed.substring(0, 15);
            if (processed.endsWith(".")) {
                processed = processed.substring(0, processed.length() - 1);
            }
        }
        
        // 7단계
        while (processed.length() < 3) {
            processed += processed.charAt(processed.length() - 1);
        }
        
        return processed;
    }
}