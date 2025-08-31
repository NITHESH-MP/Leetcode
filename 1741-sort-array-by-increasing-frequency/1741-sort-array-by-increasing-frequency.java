class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int n : nums)
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b) ->{
            if(a.getValue().equals(b.getValue()))
                return b.getKey() - a.getKey();
            else
                return a.getValue() - b.getValue();
        } );

        int k = 0;
        for(int i = 0; i < list.size(); i++)
        {
            int val = list.get(i).getKey();
            int n = list.get(i).getValue();

            while(n > 0)
            {
                nums[k++] = val;
                n--;
            }
        }

        return nums;
    }
}