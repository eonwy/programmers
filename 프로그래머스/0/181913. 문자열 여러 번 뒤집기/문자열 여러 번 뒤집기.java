class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        
        for(int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1] + 1;
            String reversed = new StringBuilder(sb.substring(start, end)).reverse().toString();
            
            sb.replace(start, end, reversed);
        }
        
        return sb.toString();
    }
}