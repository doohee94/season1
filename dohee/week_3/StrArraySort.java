package week_3;

import java.util.Arrays;

public class StrArraySort {
    public static String solution(String x) {
        String answer = "";

//    List<String> test = s.chars().sorted().mapToObj(t->String.valueOf((char)t)).collect(Collectors.toList());

//     for(int i=test.size()-1; i>=0; i--){
//     answer += test.get(i);
//   }


        int []arr = new int[x.length()];
        for(int i=0; i<x.length(); i++){
            arr[i] = x.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            answer += String.valueOf((char)arr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("Test"));
    }
}
