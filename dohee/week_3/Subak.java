package week_3;

public class Subak {
    public static String solution(int a) {
        String answer = "";

        for(int i=0; i<a/2; i++) {
            answer +="수박";
        }

        if(a % 2 !=0) {

            answer+="수";

        }

        return answer;
    }

    public static void main(String[] args) {
        solution(3);
    }
}
