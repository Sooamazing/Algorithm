package LeetCode.java;

// 26-08-11 5min
// https://leetcode.com/problems/climbing-stairs
public class ClimbingStairs_70 {

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[1] = 1;
        if (n > 1) {
            dp[2] = 2;
        }
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}