package LeetCode.java;

import java.util.Arrays;

// 26-07-16 13min
// https://leetcode.com/problems/sum-of-gcd-of-formed-pairs
public class SumofGCDofFormedPairs_3867 {

    public long gcdSum(int[] nums) {

        int max = 0;
        long[] prefixGcd = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            max = Math.max(max, n);
            prefixGcd[i] = gcd(n, max);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            sum += gcd(prefixGcd[i], prefixGcd[nums.length - i - 1]);
        }

        return sum;

    }

    private long gcd(long x, long y) {

        return y == 0 ? x : gcd(y, x % y);
    }
}