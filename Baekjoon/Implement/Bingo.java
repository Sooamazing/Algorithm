package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 25-10-03 30min
// https://www.acmicpc.net/problem/2578
public class Bingo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, int[]> cheolsuNumberPositionMap = new HashMap<>();
        boolean[][] checked = new boolean[5][5];
        boolean[] columnBingo = new boolean[5];
        boolean[] rowBingo = new boolean[5];
        boolean[] diagonalBingo = new boolean[2];

        // 철수 빙고판 입력
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cheolsuNumberPositionMap.put(Integer.parseInt(st.nextToken()), new int[]{i, j});
            }
        }

        int bingoCount = 0;
        int callCount = 0;

        // 세 개 이상 그어지는 순간 "빙고"
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                callCount++;
                int calledNumber = Integer.parseInt(st.nextToken());
                int[] position = cheolsuNumberPositionMap.get(calledNumber);
                int row = position[0];
                int col = position[1];
                checked[row][col] = true;

                if (!rowBingo[row]) {
                    boolean isRowBingo = isRowBingo(checked, row);
                    if (isRowBingo) {
                        rowBingo[row] = true;
                        bingoCount++;
                    }
                }

                if (!columnBingo[col] && isColBingo(checked, col)) {
                    columnBingo[col] = true;
                    bingoCount++;
                }

                // 대각선 - 왼쪽 위부터 아래로
                if (row == col && !diagonalBingo[0]) {
                    boolean isDiagonalBingo = true;
                    for (int k = 0; k < 5; k++) {
                        if (!checked[k][k]) {
                            isDiagonalBingo = false;
                            break;
                        }
                    }
                    if (isDiagonalBingo) {
                        diagonalBingo[0] = true;
                        bingoCount++;
                    }
                }
                // 대각선 - 오른쪽 위부터 아래로
                if (row + col == 4 && !diagonalBingo[1]) {
                    boolean isDiagonalBingo = true;
                    for (int k = 0; k < 5; k++) {
                        if (!checked[k][4 - k]) {
                            isDiagonalBingo = false;
                            break;
                        }
                    }
                    if (isDiagonalBingo) {
                        diagonalBingo[1] = true;
                        bingoCount++;
                    }
                }

                if (bingoCount >= 3) {
                    System.out.println(callCount);
                    return;
                }
            }
        }

    }

    private static boolean isColBingo(boolean[][] checked, int col) {

        for (int k = 0; k < 5; k++) {
            if (!checked[k][col]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRowBingo(boolean[][] checked, int row) {

        for (int k = 0; k < 5; k++) {
            if (!checked[row][k]) {
                return false;
            }
        }
        return true;
    }
}