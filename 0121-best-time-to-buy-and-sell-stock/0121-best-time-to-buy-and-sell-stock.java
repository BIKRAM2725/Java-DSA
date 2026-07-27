class Solution {
    public int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;

        int profit = 0;
        
        for(int i : prices)
        {
            buy = Math.min(buy, i);

            if(i > buy)
            {
                profit = Math.max(profit, i-buy);
            }
        }
        return profit;
    }
}