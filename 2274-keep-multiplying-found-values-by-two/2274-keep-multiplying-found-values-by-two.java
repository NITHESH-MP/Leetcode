class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list = new ArrayList<>();

        for(int n : nums)
            list.add(n);
        
        while(list.contains(original)){
            original *= 2;
        }

        return original;
    }
}