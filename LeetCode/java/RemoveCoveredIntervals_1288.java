package LeetCode.java;

import java.util.Arrays;

// 26-07-06 27min
// https://leetcode.com/problems/remove-covered-intervals
public class RemoveCoveredIntervals_1288 {

    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            }
            return o1[0] - o2[0];
        });

        int length = intervals.length;
        int total = length;
        for (int i = 0; i < length; i++) {
            int right = intervals[i][1];
            for (int j = i + 1; j < length; j++) {
                int[] interval = intervals[j];
                if (interval[0] == -1) {
                    continue;
                }
                if (interval[0] > right) {
                    System.out.println("break: " + interval[0] + ", " + interval[1]);
                    break;
                }
                if (interval[1] <= right) {
                    System.out.println("remove: " + interval[0] + ", " + interval[1]);
                    total--;
                    intervals[j] = new int[]{-1, -1};
                }
            }
        }

        return total;
    }
}