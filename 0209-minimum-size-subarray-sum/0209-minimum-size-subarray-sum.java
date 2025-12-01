class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int prefixSum = 0;
        int len = Integer.MAX_VALUE;
        int l = 0, r = 0;

        while(r < n){
            prefixSum += nums[r];

            while(prefixSum >= target){
                len = Math.min(len, (r - l + 1));
                prefixSum -= nums[l];
                l++;
            }
            r++;
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }
}