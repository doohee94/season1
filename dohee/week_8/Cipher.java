package week_8;

public class Cipher {


    public static String solution(String s, int n) {

        String answer = "";

        int[] test = s.chars().map(t -> {
            if (t == 32) {
                return t;
            } else if (Character.isUpperCase(t)) {

                return t+n > 90 ? t+n-26 : t+n;

            } else {
                return t+n > 122 ? t+n-26 : t+n;
            }
        }).toArray();


        for (int i : test) {
            answer += String.valueOf((char) i);
        }



        return answer;
    }


    public static void main(String[] args) {

    }


}
