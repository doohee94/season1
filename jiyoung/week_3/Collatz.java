class Solution {
    public int solution(int num) {
        int answer = 0;

        Long num_temp = Long.parseLong(String.valueOf(num));
        while(num_temp != 1) {
            if(answer == 500){
                answer = -1;
                break;
            }

            if (num_temp % 2 == 0) {
                num_temp = num_temp / 2;
            } else {
                num_temp = (num_temp * 3) + 1;
            }

            answer += 1;
        }

        return answer;
    }
}