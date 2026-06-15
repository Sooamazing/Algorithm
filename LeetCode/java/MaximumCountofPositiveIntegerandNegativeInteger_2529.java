package LeetCode.java;

// 26-06-15 1min
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer
public class MaximumCountofPositiveIntegerandNegativeInteger_2529 {

    public int maximumCount(int[] nums) {

        int pos = 0;
        int neg = 0;
        for (int v : nums) {
            if (v > 0) {
                pos++;
            } else if (v < 0) {
                neg++;
            }
        }

        return Math.max(pos, neg);
    }
}