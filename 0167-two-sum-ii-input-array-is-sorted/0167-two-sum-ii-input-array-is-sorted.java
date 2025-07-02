class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int pairs = target - nums[i];
            if(map.containsKey(pairs))
            {
                return new int[] {map.get(pairs)+1, i+1};
            }
            else
                map.put(nums[i], i);
        }  

        return new int[0]; 
    }
}