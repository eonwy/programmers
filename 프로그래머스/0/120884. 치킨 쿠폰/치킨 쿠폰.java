class Solution {
    public int solution(int chicken) {
        int coupon = chicken; // 발급된 쿠폰
        int service = 0; // 서비스 치킨 주문
        
        while(coupon >= 10){
            int last = coupon % 10;
            service += coupon / 10;
            coupon = last + (coupon / 10);
        }

        return service;
    }
}