class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList(1));
        if(numRows == 1)
            return result;
        
        result.add(Arrays.asList(1, 1));               
        if(numRows == 2)
            return result;
        
        for(int i = 2; i < numRows; i++)
        {
            List<Integer> sum = new ArrayList<>();
            sum.add(1);
            for(int j = 1; j < i; j++)
            {
                int s = result.get(i-1).get(j) + result.get(i-1).get(j-1);

                sum.add(s);
            }
            sum.add(1);
            result.add(sum);
        }

        return result;
    }
}