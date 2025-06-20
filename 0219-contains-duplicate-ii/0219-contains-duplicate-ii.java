class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int a = 0,j;
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                j = map.get(nums[i]);
                a = Math.abs(i-j);
                if(a <= k)
                    return true;
            }

            map.put(nums[i], i);

        }

        return false;
        
    }
}