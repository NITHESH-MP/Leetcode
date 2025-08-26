class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int maxArea = 0;
        int maxDigonal = 0;

        for(int i = 0; i < dimensions.length; i++)
        {
            int l = dimensions[i][0];
            int b = dimensions[i][1];

            int digonal = l * l + b * b;
            int area = l * b;

            if(digonal > maxDigonal)
            {
                maxDigonal = digonal;
                maxArea = area;
            }
            else if(digonal == maxDigonal && area > maxArea)
            {
                maxArea = area;
            }
            
        }

        return maxArea;
    }
}