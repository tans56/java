package baekjoontest;
// 프로그래머스 LV.1 수박수박수박수박수?
public class Ex10 {


        public String solution(int n) {
            String answer = "";
            for(int i=0; i<n; i++){
                if(i%2==0){
                    answer = answer + "수";
                }else{
                    answer = answer + "박";
                }

            }


            return answer;
        }


    public static void main(String[] args) {

        Ex10 sol = new Ex10();
        System.out.println(sol.solution(7));

    }
}
