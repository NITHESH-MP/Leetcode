class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        int  dir = 0;
        int k = 0;

        for(int i = 0; i < m + n - 1; i++)
        {
            if(dir == 0)
            {
                if(i < m)
                {
                    r = i;
                    c = 0;
                }
                else
                {
                    r = m - 1;
                    c = i - (m - 1);
                }
                while(r >= 0 && c < n)
                {
                    result[k++] = mat[r][c];
                    r--;
                    c++;
                }
                dir = 1;
            }
            else
            {
                if(i < n)
                {
                    r = 0;
                    c = i;
                }
                else
                {
                    r = i - (n - 1);
                    c = n - 1;
                }
                while(r < m && c >= 0)
                {
                    result[k++] = mat[r][c];
                    r++;
                    c--;
                }
                dir = 0;
            }

        }   

        return result; 
    }
}