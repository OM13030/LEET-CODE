class Solution {
    private boolean isPrime(int n){
            if(n <= 1){
                return false;
            }
            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    public int diagonalPrime(int[][] nums) {
        int len = nums.length;
        int max = 0;
        for(int i = 0;i < len; i++){
            int main = nums[i][i];
            int sec = nums[i][len-1-i];
            if(main > max && isPrime(main)){
                max = main;
            }
            if(sec > max && isPrime(sec)){
                max = sec;
            }
        }
        return max;


    }
}