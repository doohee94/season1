package week_1;

public class SumAtoB {

    public static long solution(int a, int b) {
        long answer = 0;
        int temp;
        if(a>b){
            temp = a;
            a=b;
            b=temp;
        }
        for(int i=a; i<=b; i++){
            answer +=i;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(10,40));

    }

}
