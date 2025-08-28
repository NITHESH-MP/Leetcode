class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        for(int c = 0; c < n; c++)
        {
            int pl = Math.min(m, n - c);
            for(int pass = 0; pass < pl - 1; pass++)
            {
                int i = 0, j = c;
                while(i + 1 < m && j + 1 < n)
                {
                    if(mat[i][j] > mat[i+1][j+1])
                    {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i+1][j+1];
                        mat[i+1][j+1] = temp;
                    }
                    i++;
                    j++;
                }
            }
        }
        for(int r = 0; r < m; r++)
        {
            int pl = Math.min(m - r, n);
            for(int pass = 0; pass < pl - 1; pass++)
            {
                int i = r, j = 0;
                while(i + 1 < m && j + 1 < n)
                {
                    if(mat[i][j] > mat[i+1][j+1])
                    {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i+1][j+1];
                        mat[i+1][j+1] = temp;
                    }
                    i++;
                    j++;
                }
            }
        }

        return mat;
    }
}