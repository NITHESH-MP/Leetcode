class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int k = 0, dir = 0;
        int r = 0, c = 0;

        while(k < m * n)
        {
            result[k++] = mat[r][c]; 

            if(dir == 0)
            {
                if(c == n-1)
                {
                    r++;
                    dir = 1;
                }
                else if(r == 0)
                {
                    c++;
                    dir = 1;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r == m - 1)
                {
                    c++;
                    dir = 0;
                }
                else if(c == 0)
                {
                    r++;
                    dir = 0;
                }
                else
                {
                    r++;
                    c--;
                }
            }

        }

        return result;        
    }
}