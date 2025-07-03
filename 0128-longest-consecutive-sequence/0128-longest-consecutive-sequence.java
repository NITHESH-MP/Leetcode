class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int count = 1, max = 1;
        Arrays.sort(nums);

        if(nums.length == 0)
            return 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1] == nums[i]+1)
                count++;
            else if(nums[i+1] == nums[i])
                continue;
            else
            {
                max = Math.max(count,max);
                count = 1;
            }

        }  
        max = Math.max(count,max);

        return max;
    }
}