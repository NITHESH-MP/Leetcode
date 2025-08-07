class Solution {
    public int totalFruit(int[] fruits) 
    {
        int count = 0;
        int max = 0;
        int start = 0, end = 0;
        
        HashSet<Integer> basket = new HashSet<>();

        while(end < fruits.length)
        {
            if(basket.contains(fruits[end]))
            {
                count++;
                end++;
            }
            else
            {
                if(basket.size() < 2)
                {
                    count++;
                    basket.add(fruits[end]);
                    end++;
                }
                else
                {
                    max = Math.max(count, max);
                    count = 0;
                    start = end - 1;
                    while(start >= 0 && fruits[start] == fruits[end-1])
                    {
                        count++;
                        start--;
                    }
                    basket.remove(fruits[start]);
                    start++;
                }
            }
                
        }

        max = Math.max(count, max);

        return max;
    }
}