class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int j = 0;j<matrix[0].length;j++)
        {
            for(int i=0;i<matrix.length;i++)
            {
                pq.add(matrix[i][j]);
            }
        }     

        while(k!=1)
        {
            pq.poll();
            k--;
        }
        
        return pq.poll();
    }
}