class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> result = new ArrayList<>(); 

        result.add(1);
        if(rowIndex == 0)
            return result;

        result.add(1);      
        if(rowIndex == 1)
            return result;

        for(int i = 2; i <= rowIndex; i++)
        {
            for(int j = result.size()-1; j > 0; j--)
            {
                int sum = result.get(j) + result.get(j-1);
                result.set(j, sum);
            }
            result.add(1);
        }

        return result;
    }
}