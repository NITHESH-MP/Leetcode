class Solution {
    public int maxProfit(int[] prices) 
    {
        int totalprofit = 0, profit = 0, buy = prices[0];

        for(int i= 1;i<prices.length;i++)
        {
            profit = prices[i] - buy;

            if(profit > 0)
                totalprofit += profit;
            buy = prices[i];
        }

        return totalprofit;
    }
}