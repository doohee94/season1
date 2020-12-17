class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        
        for(int i = 10000; i>=1; i = i / 10){
            sum = sum + temp / i;
            temp = temp % i;
        }

        return x % sum == 0 ? true : false;
    }
}