package baekjoontest;

public class Ex09 {
    public int solution(int num, int k) {
        int answer = 0;
        String snum = String.valueOf(num);
        String knum = String.valueOf(k);

        for(int i=0; i<snum.length(); i++){
            if(snum.charAt(i) == knum.charAt(0)) {
               int result = snum.charAt(i) - 48;
               answer = snum.indexOf(result);
                break;
            }


        }

        return answer;
    }

    public static void main(String[] args) {

        Ex09 sol = new Ex09();
        System.out.println(sol.solution(29183,8));

    }

}
