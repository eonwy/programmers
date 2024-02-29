class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int even = 0;
        int odd = 0;
        for (int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even++;
            }
            else if(num_list[i] % 2 != 0){
                odd++;
            }
        }
        answer = new int[]{even, odd};
        return answer;
    }
}