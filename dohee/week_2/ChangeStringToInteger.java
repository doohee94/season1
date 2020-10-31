package week_2;

public class ChangeStringToInteger {

    public static int solution(String s) {

        //첫글자 판별
        String str = isSign(s.charAt(0)) ? s.substring(1, s.length()) : s;


        return isPositiveNumber(s.charAt(0)) ? Integer.parseInt(str)
                : Integer.parseInt(str) * -1;
    }

    private static boolean isPositiveNumber(char firstChar) {
        return firstChar == '+' || firstChar != '-';
    }

    private static boolean isSign(char firstChar) {
        return firstChar == '+' || firstChar == '-';
    }

    public static void main(String[] args) {
        System.out.println(solution("-124"));
    }
}
