package week_4;

public class StrangeStr {

    public static String solution(String s) {
        String answer = "";

        boolean isEven = true;

        for(int i=0; i<s.length(); i++){

            String str = String.valueOf(s.charAt(i));

            if(str.equals(" ")){
                isEven = true;
                answer += str;
                continue;
            }

            answer += isEven ? str.toUpperCase() : str.toLowerCase();
            isEven = !isEven;

        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(solution("try hello world")));
    }

}
