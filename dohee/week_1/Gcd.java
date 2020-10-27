package week_1;

public class Gcd {


    private static int mod(int a, int b){
        return b%a;
    }

    public static int[] solution(int n, int m) {
        int[] answer = {1,1};

        for(int i = n; i>0; i--){

            if(i ==1 || n == 1 || m == 1){
                answer[1] = answer[0] * n * m;
                break;
            }

            if(mod(i,n)==0 && mod(i,m)==0){
                n = n/i;
                m = m/i;
                answer[0] *= i;
                i=n;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("["+solution(12,18)[0]+solution(12,18)[1]+"]");
    }

}
