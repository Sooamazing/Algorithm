package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

// 25-11-27 70min
// https://www.acmicpc.net/problem/2628
public class PaperCutting {

    private static int rows;

    private static int cols;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        cols = Integer.parseInt(st.nextToken());
        rows = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[rows + 1][cols + 1];
//        boolean[][] cut = new boolean[rows + 1][cols + 1];
        Set<Integer> cutRowSet = new HashSet<>();
        Set<Integer> cutColSet = new HashSet<>();

        int cutting = Integer.parseInt(br.readLine());
        for (int i = 0; i < cutting; i++) {
            st = new StringTokenizer(br.readLine());

            int cmd = Integer.parseInt(st.nextToken());
            if (cmd == 0) {
                int cutRow = Integer.parseInt(st.nextToken());
                cutRowSet.add(cutRow);
//                for (int j = 0; j <= cols; j++) {
//                    cut[cutRow][j] = true;
//                }
            } else {
                int cutCol = Integer.parseInt(st.nextToken());
                cutColSet.add(cutCol);
//                for (int j = 0; j <= rows; j++) {
//                    cut[j][cutCol] = true;
//                }
            }
        }

        int maxArea = 0;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                if (!visited[i][j]) {
                    int area = getArea(visited, cutRowSet, cutColSet, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(maxArea);
    }

    private static int getArea(boolean[][] visited, Set<Integer> cutRowSet, Set<Integer> cutColSet,
            int row, int col) {

        int[][] direction = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{row, col});
        visited[row][col] = true;

        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;
        while (!que.isEmpty()) {
            int[] poll = que.poll();

            int currentRow = poll[0];
            int currentCol = poll[1];
            for (int i = 0; i < 4; i++) {
                int rowDirection = direction[i][0];
                int nextRow = currentRow + rowDirection;
                int colDirection = direction[i][1];
                int nextCol = currentCol + colDirection;

                if (nextRow < 0 || nextRow > rows || nextCol < 0 || nextCol > cols
                        || visited[nextRow][nextCol]) {
                    continue;
                }
                minRow = Math.min(minRow, nextRow);
                minCol = Math.min(minCol, nextCol);
                maxRow = Math.max(maxRow, nextRow);
                maxCol = Math.max(maxCol, nextCol);
                boolean isDown = rowDirection == 1;
                boolean isRight = colDirection == 1;
                if (isRight && cutColSet.contains(nextCol)) {
                    continue;
                }
                if (isDown && cutRowSet.contains(nextRow)) {
                    continue;
                }
                visited[nextRow][nextCol] = true;
                que.add(new int[]{nextRow, nextCol});
            }
        }

        return (maxCol - minCol) * (maxRow - minRow);
    }
}