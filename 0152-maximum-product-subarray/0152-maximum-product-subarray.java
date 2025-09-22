class Solution {
    public int maxProduct(int[] nums) {
        
        int result = nums[0];
        int currMax = 1;
        int currMin = 1;

        for(int n : nums){
            int temp = currMax * n;
            currMax = Math.max(n, Math.max(temp, currMin * n));
            currMin = Math.min(n, Math.min(temp, currMin * n));

            result = Math.max(result, currMax);    
        }

        return result;

    }
}