class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int c = 1; c < grid[0].length; c++)
        {
            int pl = Math.min(m, n - c);
            for(int pass = 0; pass < pl - 1; pass++)
            {
                int i = 0, j = c;
                while(i + 1 < grid.length && j + 1 < grid[0].length)
                {
                    if(grid[i][j] > grid[i+1][j + 1])
                    {
                        int temp = grid[i][j];
                        grid[i][j] = grid[i+1][j+1];
                        grid[i+1][j+1] = temp; 
                    }
                    i++;
                    j++; 
                }   
            }
        }

        for(int r = 0; r < grid.length; r++)
        {
            int pl = Math.min(m - r, n);
            for(int pass = 0; pass < pl - 1; pass++)
            {
                int i = r, j = 0;
                while(i + 1 < grid.length && j + 1 < grid[0].length)
                {
                    if(grid[i][j] < grid[i+1][j+1])
                    {
                        int temp = grid[i][j];
                        grid[i][j] = grid[i+1][j+1];
                        grid[i+1][j+1] = temp; 
                    }
                    i++;
                    j++;
                } 
            }
        }
        

        return grid;

    }
}