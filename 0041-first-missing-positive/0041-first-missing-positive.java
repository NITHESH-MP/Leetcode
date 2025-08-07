class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        
        int i = 0;

        while(i < nums.length)
        {
            int crct = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[crct])
                swap(nums, i, crct);
            else
                i++;
        }

        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] != i+1)
                return i+1;
        }

        return nums.length + 1;

    }

    public void swap(int[] nums, int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}