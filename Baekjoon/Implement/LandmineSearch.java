package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-09 30min
// https://www.acmicpc.net/problem/4396
// 참고: https://shutcoding.tistory.com/entry/java-int-to-char-%ED%98%95%EB%B3%80%ED%99%98
public class LandmineSearch {

    private static int size;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        size = Integer.parseInt(br.readLine());

        boolean[][] isLandmineMap = new boolean[size][size];
        boolean[][] isPoppedMap =
                new boolean[size][size];
        char[][] answerMap = new char[size][size];

        boolean isDead = false;
        for (int i = 0; i < size; i++) {
            String line = (br.readLine());
            for (int j = 0; j < size; j++) {
                // 온점(.)은 지뢰가 없는 지점이며 별표(*)는 지뢰가 있는 지점
                isLandmineMap[i][j] = line.charAt(j) == '*';
            }
        }

        for (int i = 0; i < size; i++) {
            String line = (br.readLine());
            for (int j = 0; j < size; j++) {
                // 이미 열린 칸은 영소문자 x로, 열리지 않은 칸은 온점(.)으로 표시된다
                isPoppedMap[i][j] = line.charAt(j) == 'x';
                // 지뢰가 없으면서 열린 칸에는 0과 8 사이의 숫자가 있어야 한다. 지뢰가 있는 칸이 열렸다면 지뢰가 있는 모든 칸이 별표(*)로 표시되어야 한다. 다른 모든 지점은 온점(.)이어야 한다.
                if (isLandmineMap[i][j] && isPoppedMap[i][j]) {
                    isDead = true;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isLandmineMap[i][j] && isPoppedMap[i][j]) {
                    answerMap[i][j] = '*';
                } else if (isPoppedMap[i][j]) {
                    int surroundLandmines = getSurroundLandmines(isLandmineMap, i, j);
                    answerMap[i][j] = (char) (surroundLandmines
                            + '0'); // int를 char로 변환 시 0을 더하거나 Character.forDigit(value_int , radix); 사용.
                } else if (isDead && isLandmineMap[i][j]) {
                    answerMap[i][j] = '*';
                } else {
                    answerMap[i][j] = '.';
                }
                sb.append(answerMap[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static int getSurroundLandmines(boolean[][] isLandmineMap,
            int row, int col) {

        int[][] directions =
                new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

        int sum = 0;
        for (int i = 0; i < directions.length; i++) {
            int newRow = row + directions[i][0];
            int newCol = col + directions[i][1];
            if (newRow < 0 || newRow >= size || newCol < 0 || newCol >= size) {
                continue;
            }
            if (!isLandmineMap[newRow][newCol]) {
                continue;
            }
            sum++;
        }

        return sum;
    }
}