package baekjoontest;
// 프로그래머스 치킨 쿠폰 LV.0
public class Ex08 {


        public int solution(int chicken) {
            int coupon = chicken;
            int count = 0;

            while(coupon >= 10) {
                int lCoupon = coupon % 10;
                count += coupon / 10;
                coupon = lCoupon + coupon/10;
            }

            return count;
        }




    public static void main(String[] args) {

        Ex08 sol = new Ex08();
        System.out.println(sol.solution(100));
        Arrays
    }
}
