package LeetCode.java;

// 26-06-06
// https://leetcode.com/problems/left-and-right-sum-differences
class LeftandRightSumDifferences_2574 {

    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; ++i) {
            ans[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; --i) {
            ans[i] = Math.abs(ans[i] - rightSum);
            rightSum += nums[i];
        }

        return ans;
    }
}