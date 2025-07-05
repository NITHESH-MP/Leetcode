class Solution {
    public int findLucky(int[] arr) 
    {
        int count = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        int value , freq;
        for( Map.Entry<Integer, Integer> entry : map.entrySet() )
        {
            value = entry.getKey();
            freq = entry.getValue();
            
            if( value == freq)
                count = Math.max(value, count);
        }
        

        return count;
    }
}