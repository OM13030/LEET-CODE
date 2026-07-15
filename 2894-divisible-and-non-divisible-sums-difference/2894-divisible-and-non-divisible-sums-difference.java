class Solution {
    public int differenceOfSums(int n, int m) {
        int notdivisible = 0;
        int divisible = 0;
        for(int i = 0; i <= n; i++){
            if(i % m == 0){
                divisible += i;
            }else{
                notdivisible += i;
            }
        }
        return notdivisible - divisible;
    }
}