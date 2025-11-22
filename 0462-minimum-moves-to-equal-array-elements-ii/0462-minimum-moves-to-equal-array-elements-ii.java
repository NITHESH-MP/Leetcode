class Solution {
    public int minMoves2(int[] nums) {
        int op = 0;
        int median = 0;
        int n = nums.length;

        Arrays.sort(nums);
        median = nums[n/2];

        for(int i : nums)
            op += Math.abs(i - median);
        
        return op;
    }
}