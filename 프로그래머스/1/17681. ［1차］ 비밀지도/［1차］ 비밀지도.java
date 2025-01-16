class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i=0; i<arr1.length; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            temp = String.format("%"+n+"s", temp).replace(" ", "0");
            
            answer[i] = temp.replaceAll("1", "#").replaceAll("0", " ");
        }
        
        return answer;
    }
}