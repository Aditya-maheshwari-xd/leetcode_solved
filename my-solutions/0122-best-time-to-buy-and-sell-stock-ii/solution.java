class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int min=prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>min)
            {
                max = Math.max(max,prices[i]);
            }
            if(prices[i]<min||prices[i]<max)
            {
                profit = profit+max-min;
                min=prices[i];
                max=prices[i];
            }
        }
        profit +=max-min;
        return profit;
    }
}
