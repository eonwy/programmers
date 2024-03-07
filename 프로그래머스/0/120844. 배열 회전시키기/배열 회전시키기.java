class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            if("right".equals(direction)){
                answer[(i+1)%numbers.length] = numbers[i];
            }
            else if("left".equals(direction)){
                answer[i] = numbers[(i+1)%numbers.length];
            }
        }
        return answer;
    }
}