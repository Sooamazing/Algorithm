package LeetCode.java;

// 26-06-28 5min
// https://leetcode.com/problems/count-total-number-of-colored-cells/
public class CountTotalNumberofColoredCells_2579 {

    public long coloredCells(int n) {

        long sum = 1;
        for (long i = 0; i < n; i++) {
            sum += (i * 4);
        }
        return sum;
    }
}