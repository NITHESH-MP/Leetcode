class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                return new int[] {map.get(target - nums[i]),i};
            }
            else
                map.put(nums[i], i);
        }    

        return new int[0];

    }
}