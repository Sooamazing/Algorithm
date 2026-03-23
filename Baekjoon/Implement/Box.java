package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-23 10min
// https://www.acmicpc.net/problem/9455
public class Box {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            int[][] grid = new int[row][col];
            for (int i = row - 1; i >= 0; i--) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < col; j++) {
                    grid[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int move = 0;
            for (int c = 0; c < col; c++) {
                int count = 0;
                for (int r = 0; r < row; r++) {
                    if (grid[r][c] == 1) {
                        move += (r - count);
                        count++;
                    }
                }
            }
            sb.append(move).append('\n');
        }
        System.out.println(sb);
    }
}