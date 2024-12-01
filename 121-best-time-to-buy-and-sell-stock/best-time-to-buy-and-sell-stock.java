class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;  // Initialize the maximum profit
        int minPrice = Integer.MAX_VALUE;  // Initialize the minimum price as the maximum possible value

        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate the profit and update the maximum profit if it's greater
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;  // Return the maximum profit
    }
}