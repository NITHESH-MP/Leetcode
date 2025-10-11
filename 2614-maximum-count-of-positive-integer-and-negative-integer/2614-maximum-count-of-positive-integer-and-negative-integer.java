class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for(int n : nums){
            if(n > 0)
                pos++;
            if(n < 0)
                neg++;
            else
                continue;
        }

        return Math.max(pos, neg);
    }
}