class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        Map<Integer, Integer> freqmap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int n : nums)
            freqmap.put(n , freqmap.getOrDefault(n, 0) + 1);

        int n = nums.length/3;
        for(Map.Entry<Integer, Integer> entry : freqmap.entrySet())
        {
            if(entry.getValue() > n)
                result.add(entry.getKey());
        }    

        return result;
    }
}