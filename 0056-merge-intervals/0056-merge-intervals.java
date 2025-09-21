class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> results = new ArrayList<>();
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int[] prev = intervals[0];

        for(int i = 1; i < intervals.length; i++)
        {
            int[] curr = intervals[i];

            if(prev[1] >= curr[0])
            {
                prev[1] = Math.max(prev[1], curr[1]); 
            }
            else
            {
                results.add(prev);
                prev = curr;
            }
            
        }
        results.add(prev);

        return results.toArray(new int[results.size()][]);
    }
}