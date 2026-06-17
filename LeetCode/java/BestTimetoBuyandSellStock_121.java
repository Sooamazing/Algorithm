package LeetCode.java;

// 26-06-17 13min
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock_121 {

    public int maxProfit(int[] prices) {

        int maxPrice = 0;
        int min = prices[prices.length - 1];
        int max = min;
        int prev = min;
        for (int i = prices.length - 2; i >= 0; i--) {
            int current = prices[i];
            if (prev < current) {
                max = Math.max(max, current);
                System.out.println(max);
            } else {
                maxPrice = Math.max(maxPrice, max - current);
                System.out.println(prev + ", " + current + ", " + maxPrice);
            }
            prev = current;
        }
        return maxPrice;
    }
}