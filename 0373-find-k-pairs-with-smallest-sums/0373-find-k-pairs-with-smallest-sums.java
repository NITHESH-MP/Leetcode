class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) 
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        int sum = 0, jBreak = nums2.length;

        for(int i=0;i<nums1.length;i++)
        {
            for(int j = 0;j<jBreak;j++)
            {
                sum = nums1[i] + nums2[j];
                
                if (pq.size() == k)
                {
                    if(pq.peek()[0] <= sum)
                    {
                        jBreak = j;
                        break;
                    }
                    pq.poll();
                }
                pq.add(new int[]{sum, nums1[i], nums2[j]});
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i<k ;i++)
        {
            int[] top = pq.poll();
            List<Integer> pair = new ArrayList<>();
            pair.add(top[1]);
            pair.add(top[2]);
            result.add(pair);
        }

        Collections.reverse(result);
        return result;

    }
}