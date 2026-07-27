package LeetCode.java;

import java.util.Arrays;

// 26-07-27 5min
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
public class MaximumProductofTwoElementsinanArray_1464 {

    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int length = nums.length;
        return (nums[length - 1] - 1) * (nums[length - 2] - 1);

    }
}