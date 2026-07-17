package Leetcode.java;

// 26-07-17 20min
// https://leetcode.com/problems/single-number/
class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int prev = nums[0];
        int prevCount = 0;
        for (int n : nums) {
            if (prev == n) {
                prevCount++;
            } else {
                if (prevCount == 1) {
                    return prev;
                }
                prevCount = 1;
            }

            prev = n;
        }

        // 마지막일 경우 대비
        return prev;
    }
}
