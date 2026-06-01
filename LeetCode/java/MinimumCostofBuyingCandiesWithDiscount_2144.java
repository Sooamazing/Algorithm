package LeetCode.java;

import java.util.Arrays;

// 26-06-01 3min
// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount
public class MinimumCostofBuyingCandiesWithDiscount_2144 {

    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int count = 0;
        int sum = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if (count % 3 == 0) {
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}