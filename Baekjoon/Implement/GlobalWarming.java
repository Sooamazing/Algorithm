package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-06 45min
// https://www.acmicpc.net/problem/5212
public class GlobalWarming {

    private static final int[] dx = {-1, 1, 0, 0};

    private static final int[] dy = {0, 0, -1, 1};

    private static int minCol = 11;

    private static int minRow = 11;

    private static int maxRow;

    private static int maxCol;

    private static int row;

    private static int col;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        boolean[][] visited = new boolean[row][col];
        boolean[][] isIslandInMap = new boolean[row][col];
        boolean[][] nextIslandInMap = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String map = br.readLine();
            for (int j = 0; j < col; j++) {
                isIslandInMap[i][j] = map.charAt(j) == 'X';
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (isIslandInMap[i][j] && !visited[i][j]) {
                    visited[i][j] = true;
                    boolean down = wouldBeDown(isIslandInMap, i, j);
                    if (!down) {
                        minCol = Math.min(minCol, j);
                        minRow = Math.min(minRow, i);
                        maxCol = Math.max(maxCol, j);
                        maxRow = Math.max(maxRow, i);
                        nextIslandInMap[i][j] = true;
                    }
                }
            }
        }

        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                sb.append(nextIslandInMap[i][j] ? "X" : ".");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static boolean wouldBeDown(boolean[][] isIslandInMap, int currentRow, int currentCol) {

        if (!isIslandInMap[currentRow][currentCol]) {
            return false;
        }

        int downSum = 0;
        for (int i = 0; i < 4; i++) {
            int nextRow = currentRow + dy[i];
            int nextCol = currentCol + dx[i];
            if (nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col) {
                downSum++;
                continue;
            }
            if (!isIslandInMap[nextRow][nextCol]) {
                downSum++;
            }
        }

        return downSum >= 3;
    }
}