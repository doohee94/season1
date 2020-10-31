package week_2;

public class PAndYCount {

    public static boolean solution(String s){

        int p = 0;
        int y = 0;

        for (int i=0; i<s.length(); i++){
            if(isMatchStr(s.charAt(i), "P")){
                p +=1;
            }else if(isMatchStr(s.charAt(i), "Y")){
                y+=1;
            }
        }
        return p == y ;
    }

    public static boolean isMatchStr(char c,String matchingStr){
        return String.valueOf(c).equalsIgnoreCase(matchingStr);
    }

    public static void main(String[] args) {
        System.out.println(solution("PpppddddfYyyyy"));
    }
}
