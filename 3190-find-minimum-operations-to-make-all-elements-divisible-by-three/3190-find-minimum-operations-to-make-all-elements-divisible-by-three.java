class Solution {
    public int minimumOperations(int[] nums) {
        
        int op = 0;

        for(int n : nums)
            op += Math.min(n % 3, 3 - (n % 3));
        
        return op;

    }
}