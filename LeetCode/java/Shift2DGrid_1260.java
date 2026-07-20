package LeetCode.java;

import java.util.LinkedList;
import java.util.List;

// 26-07-20 50min
// https://leetcode.com/problems/shift-2d-grid
public class Shift2DGrid_1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rowLength = grid.length;
        int colLength = grid[0].length;
        int total = rowLength * colLength;
        k %= total;

        List<List<Integer>> answer = new LinkedList<>();
        for (int r = 0; r < rowLength; r++) {

            List<Integer> round = new LinkedList<>();
            for (int c = 0; c < colLength; c++) {
                int order = (-k + total + r * colLength + c) % total;
                int row = order / colLength;
                int col = order % colLength;
                // System.out.println(-k+total+r*c+c);
// System.out.println(order+", "+row+", "+col);
                round.add(grid[row][col]);
            }
            answer.add(round);
        }

        return answer;
    }
}