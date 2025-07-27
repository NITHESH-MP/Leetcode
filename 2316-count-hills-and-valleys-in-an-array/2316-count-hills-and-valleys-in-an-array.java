class Solution {
    public int countHillValley(int[] nums) 
    {
        Set<Integer> hv = new HashSet<>();
        int l = 0, r = 1;

        for(int i=1;i<nums.length-1;i++)
        {
            l = i-1;
            r = i+1;
            if (nums[i] == nums[i - 1])
                continue;
            
            while(l>=0 && nums[i] == nums[l])
                l--;
            while(r<nums.length && nums[i] == nums[r])
                r++;
            
            if(l >= 0 && r < nums.length)
            {
                if(nums[i] < nums[l] && nums[i] < nums[r])
                {
                    hv.add(i);
                }
                else if(nums[i] > nums[l] && nums[i] > nums[r])
                {
                    hv.add(i);
                }
            
            }
        } 

        return hv.size();
    }
}