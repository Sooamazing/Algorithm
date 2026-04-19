package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-19 15min
// https://www.acmicpc.net/problem/1952
public class Snail2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[row][col];
        int count = moveLikeSnail(visited, row, col);
        System.out.println(count);
    }

    private static int moveLikeSnail(boolean[][] visited, int maxRow, int maxCol) {

        int count = 0;
        // right, down, left, up
        final int[][] drdc = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentR = 0;
        int currentC = 0;
        int currentDir = 0;
        visited[currentR][currentC] = true;

        while (true) {
            int prevR = currentR;
            int prevC = currentC;

            // 지금 방향으로 이동 가능한지 확인
            int tempR = prevR + drdc[currentDir][0];
            int tempC = prevC + drdc[currentDir][1];
            if (tempR < 0 || tempR >= maxRow || tempC < 0 || tempC >= maxCol
                    || visited[tempR][tempC]) {
                // 이동 불가능하면 방향 전환
                currentDir = (currentDir + 1) % 4;
                tempR = prevR + drdc[currentDir][0];
                tempC = prevC + drdc[currentDir][1];

                if (visited[tempR][tempC]) {
                    break;
                }
                count++;
            }

            currentR = tempR;
            currentC = tempC;
            visited[currentR][currentC] = true;

        }
        return count;

    }
}