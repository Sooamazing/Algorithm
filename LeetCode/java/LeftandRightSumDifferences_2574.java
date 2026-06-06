package LeetCode.java;

// 26-06-06 10min
// https://leetcode.com/problems/left-and-right-sum-differences
class LeftandRightSumDifferences_2574 {

    public int[] leftRightDifference(int[] nums) {

        int numLength = nums.length;
        int[] leftSum = new int[numLength];
        int[] rightSum = new int[numLength];
        int[] answer = new int[numLength];
        for (int i = 1; i < numLength; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        for (int i = numLength - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < numLength; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;

    }
}