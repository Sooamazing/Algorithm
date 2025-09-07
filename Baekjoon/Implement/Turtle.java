package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-07 20min
// https://www.acmicpc.net/problem/8911
public class Turtle {

    private static int[][] direction = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            int directionIndex = 0;
            int[] currentPosition = {0, 0};
            int[] cols = {0, 0}; // min, max
            int[] rows = {0, 0};

            String command = br.readLine();
            for (char c : command.toCharArray()) {

                switch (c) {
                    case 'F':
                        currentPosition[0] += direction[directionIndex][0];
                        currentPosition[1] += direction[directionIndex][1];
                        calculateMinAndMax(currentPosition[0], currentPosition[1], cols, rows);
                        break;
                    case 'B':
                        currentPosition[0] -= direction[directionIndex][0];
                        currentPosition[1] -= direction[directionIndex][1];
                        calculateMinAndMax(currentPosition[0], currentPosition[1], cols, rows);
                        break;
                    case 'L':
                        directionIndex = (directionIndex + 1) % 4;
                        break;
                    case 'R':
                        directionIndex = (directionIndex - 1 + 4) % 4;
                        break;
                    default:
                        break;
                }

            }
            int size = (cols[1] - cols[0]) * (rows[1] - rows[0]);
            sb.append(size).append("\n");
        }

        System.out.println(sb);
    }

    private static void calculateMinAndMax(int currentRow, int currentCol, int[] cols, int[] rows) {

        cols[0] = Math.min(cols[0], currentCol);
        cols[1] = Math.max(cols[1], currentCol);
        rows[0] = Math.min(rows[0], currentRow);
        rows[1] = Math.max(rows[1], currentRow);
    }
}