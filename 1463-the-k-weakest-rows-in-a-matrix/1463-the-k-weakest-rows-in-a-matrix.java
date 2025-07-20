class Solution {
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        PriorityQueue<int[]> freq = new PriorityQueue<>((a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        for(int i=0;i<mat.length;i++)
        {
            int count = 0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j] == 1)
                    count++;
                else
                    break;
            }
            freq.add(new int[]{i, count});
        }    

        int[] result = new int[k];

        for(int i=0;i<k;i++)
            result[i] = freq.poll()[0];
        
        return result;

    }
}