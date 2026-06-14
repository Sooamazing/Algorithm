package LeetCode.java;

// 26-06-14 20min
// https://leetcode.com/problems/transformed-array
public class TransformedArray_3379 {

    public int[] constructTransformedArray(int[] nums) {

        int length = nums.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int current = nums[i];
            if (current > 0) {
                answer[i] = (i + nums[i]) >= 0 ? nums[((i + nums[i]) % length)]
                        : nums[(i + nums[i]) + length];
            } else if (current < 0) {
                if ((i - Math.abs(current)) >= 0) {
                    answer[i] = nums[(i - Math.abs(current)) % length];
                } else {
                    int r = i - Math.abs(current);
                    while (r <= 0) {
                        r += length;
                    }
                    answer[i] = nums[r % length];
                }
            } else {
                answer[i] = current;
            }
        }

        return answer;
    }
}