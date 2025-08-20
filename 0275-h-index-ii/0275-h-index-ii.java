class Solution {
    public int hIndex(int[] citations) 
    {
        int hIndex = 0;
        int n = citations.length;

        for(int i = n-1; i >=0; i--)
        {
            int h = n - i;
            if(citations[i] >= h)
                hIndex = Math.max(hIndex, h);
        }    

        return hIndex;
    }
}