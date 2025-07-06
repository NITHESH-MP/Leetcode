class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer, Integer> freqmap = new HashMap<>();

        for(int n : nums)
            freqmap.put(n, freqmap.getOrDefault(n, 0)+1);

        int n = nums.length/2;

        for(Map.Entry<Integer, Integer> entry : freqmap.entrySet() )
        {
            if(entry.getValue() > n)
                return entry.getKey();
        }

        return 0;
    }
}