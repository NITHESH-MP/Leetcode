class Solution {
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int r1 = row[i];
                int r0 = m - row[i];
                int c1 = col[j];
                int c0 = n - col[j];
                
                grid[i][j] = r1 + c1 - r0 - c0; 
            }
        }

        return grid;
    }
}