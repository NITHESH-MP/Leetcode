class Solution {
    public int minMoves(int[] nums) {
        int op = 0;
        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i : nums)
            sum += i;
        
        for(int i = 0; i < n; i++){
            if(min > nums[i])
                min = nums[i];
        }

        op = sum - (min * n);

        return op;
    }
}