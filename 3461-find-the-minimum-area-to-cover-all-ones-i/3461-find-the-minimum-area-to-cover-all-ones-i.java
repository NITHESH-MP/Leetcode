class Solution 
{
    public int minimumArea(int[][] grid) 
    {
        int top = grid.length;
        int bottom = 0;
        int left = grid.length;
        int right = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }

        int h = bottom - top + 1;
        int w = right - left + 1;

        return h * w;
    }
}