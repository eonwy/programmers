class Solution {
    public int solution(int[] num_list) {
        int type = 0;
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if (i % 2 == 0) {
                type += num_list[i];
                odd += num_list[i];
            } else if (i % 2 != 0) {
                type -= num_list[i];
                even += num_list[i];
            }
        }
        
        return type > 0 ? odd : even;
    }
}