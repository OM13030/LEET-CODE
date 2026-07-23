import java.util.Arrays;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i <= nums.length- k; i++){
            int minlength = nums[i];
            int maxlength = nums[i+k-1];
            diff = Math.min(diff , maxlength - minlength);
        }
        return diff;
    }
}