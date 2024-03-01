class Solution {
    public int solution(int hp) {

        int jang = hp / 5;
        int jang_r = hp % 5;
        int byeong = jang_r / 3;
        int byeong_r = jang_r % 3;
        int ill = byeong_r / 1;
        
        return jang + byeong + ill;
    }
}