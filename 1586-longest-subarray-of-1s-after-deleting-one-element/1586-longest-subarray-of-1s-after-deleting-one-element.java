class Solution {
    public int longestSubarray(int[] nums) {
        int curr = 0;
        int result = 0;
        int prev = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                curr++;
                result = Math.max(result, curr + prev);
            }
            else
            {
                prev = curr;
                curr = 0;
            }
        }

        if(result == nums.length)
            return result - 1;
        return result;
    }
}