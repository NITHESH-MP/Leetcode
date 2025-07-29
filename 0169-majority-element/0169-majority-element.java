class Solution {
    public int majorityElement(int[] nums)
    {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        
        int n = nums.length/2;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet())
        {
            if(entry.getValue() > n)
                return entry.getKey();
        }

        return 0;
    }
}