class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int k = 0, i = 0;
    
        int[] result = new int[nums.length];

        while(k < nums.length)
        {
            result[k++] = nums[i+1];
            result[k++] = nums[i];
            i += 2;
        }

        return result;
    }
}