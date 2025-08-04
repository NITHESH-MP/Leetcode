class Solution {
    public int maxArea(int[] height) 
    {
        int l = 0, r = height.length-1;
        int result = 0;

        while(l < r)
        {
            int area = (r - l) * Math.min(height[l], height[r]);
            result = Math.max(area, result);

            if(height[l] < height[r])
                l++;
            else
                r--;
        }    

        return result;
    }
}