class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i = 0;

        while(i <= nums.size() - 2*k)
        {
            if(isIncreasing(nums, i, k) && isIncreasing(nums, i + k, k))
                return true;
            i++;
        }

        return false;

    }

    public boolean isIncreasing(List<Integer> nums, int start, int end){

        // HashSet<Integer> set = new HashSet<>();

        for(int i = start; i < start + end; i++)
        {
            // if(set.contains(nums.get(i)))
            //     return false;

            // set.add(nums.get(i));

            if( i > start && nums.get(i) <= nums.get(i - 1))
                return false;
        }
        
        return true;
    }
}