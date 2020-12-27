package week_7;

public class Average {
    public double solution(int[] arr) {
        double answer = 0;

        // return (double)Arrays.stream(arr).sum() / arr.length;

        int tNum = arr.length/2;

        for(int i=0; i<tNum; i++){
            answer += arr[i];
            answer += arr[i+tNum];
        }

        answer += arr.length %2 == 0? 0 : arr[arr.length-1];

        return  answer / arr.length;

    }
}
