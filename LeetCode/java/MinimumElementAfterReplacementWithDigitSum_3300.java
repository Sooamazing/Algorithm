package LeetCode.java;

// 26-06-03 10min
// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum
class MinimumElementAfterReplacementWithDigitSum_3300 {

    public int minElement(int[] nums) {

        int min = 100_000_000;
        for (int v : nums) {
            int tempSum = 0;
            while (v / 10 != 0) {
                tempSum += (v % 10);
                v /= 10;
            }
            tempSum += v;

            min = Math.min(min, tempSum);
        }

        return min;
    }
}