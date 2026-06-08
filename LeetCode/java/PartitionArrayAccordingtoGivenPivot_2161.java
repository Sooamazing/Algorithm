package LeetCode.java;

// 26-06-08 20min
// https://leetcode.com/problems/partition-array-according-to-given-pivot
class PartitionArrayAccordingtoGivenPivot_2161 {

    public int[] pivotArray(int[] nums, int pivot) {

        int length = nums.length;
        boolean[] visited = new boolean[length];
        int[] answer = new int[length];

        int index = 0;
        for (int round = 0; round < 3; round++) {
            for (int i = 0; i < length; i++) {
                int current = nums[i];
                if (visited[i]) {
                    continue;
                }
                if (round == 0 && current < pivot) {
                    answer[index++] = current;
                    visited[i] = true;
                    continue;
                }
                if (round == 1 && current == pivot) {
                    answer[index++] = current;
                    visited[i] = true;
                    continue;
                }
                if (round == 2 && current > pivot) {
                    answer[index++] = current;
                    visited[i] = true;
                    continue;
                }
            }
        }

        return answer;
    }
}