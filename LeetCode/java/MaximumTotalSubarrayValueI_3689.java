package LeetCode.java;

import java.util.Arrays;

// 26-06-09 7min
// https://leetcode.com/problems/maximum-total-subarray-value-i
public class MaximumTotalSubarrayValueI_3689 {

    public long maxTotalValue(int[] nums, int k) {

        Arrays.sort(nums);
        long min = nums[0];
        long max = nums[nums.length - 1];

        return (max - min) * k;
    }
}