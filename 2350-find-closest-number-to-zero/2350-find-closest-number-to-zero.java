class Solution {
    public int findClosestNumber(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int result = nums[0];

        for(int i = 0; i < nums.length; i++)
        {
            int d = Math.abs(0 - nums[i]);
            
            if(d < min)
            {
                min = d;
                result = nums[i];
            }
            if(d == min && nums[i] > result)
                result = nums[i];
                        
        }

        return result;
    }
}