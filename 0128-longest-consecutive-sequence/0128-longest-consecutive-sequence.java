class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();

        for(int n : nums)
            set.add(n);

        int max = 0, count = 1;

        for(int i : set)
        {
            if(!set.contains(i-1))
            {
                int n = i;
                count = 1; 


                while(set.contains(n+1))
                {
                    n++;
                    count++;
                }
            }

            max = Math.max(max, count);
        }
        return max;
    }
}