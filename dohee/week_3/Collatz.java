package week_3;

public class Collatz {
    public static int solution(int x) {
        int answer = 0;
        long x2 = x;
        while (x2 !=1){

            x2 = x2%2==0 ? x2/2 : x2*3+1;

            answer ++;
            if(answer >= 500) return -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

}
