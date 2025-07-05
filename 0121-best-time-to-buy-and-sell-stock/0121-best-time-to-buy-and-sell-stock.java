class Solution 
{

    public int maxProfit(int[] prices) 
    {
        int maxprofit = 0, profit = 0, min = prices[0];

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                profit = prices[i] - min;
                maxprofit = Math.max(profit, maxprofit);
            }
        }

        return maxprofit;
    }
}