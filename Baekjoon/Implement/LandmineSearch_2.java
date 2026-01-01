package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-01 10min
// https://www.acmicpc.net/problem/1996
public class LandmineSearch_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //  '.'는 지뢰가 없는 것이고 숫자는 지뢰가 있는 경우로 그 칸의 지뢰의 개수이다.
        // N개의 줄에 걸쳐서 완성된 지뢰 찾기 map을 출력한다. 지뢰는 '*'로 출력하며. 10 이상인 경우는 'M'(Many)으로 출력하면 된다. map은 숫자 또는 'M' 또는 '*'로만 이루어져 있어야 한다.
        int size = Integer.parseInt(br.readLine());
        char[][] map = new char[size][size];
        for (int i = 0; i < size; i++) {
            String line = br.readLine();
            for (int j = 0; j < size; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // 지뢰면 패스
                if (map[i][j] != '.') {
                    sb.append('*');
                    continue;
                }

                int mineCount = 0;
                for (int[] dir : directions) {
                    int nx = j + dir[0];
                    int ny = i + dir[1];

                    if (nx < 0 || ny < 0 || nx >= size || ny >= size) {
                        continue;
                    }

                    if (map[ny][nx] != '.') {
                        mineCount += map[ny][nx] - '0';
                    }
                }

                if (mineCount >= 10) {
                    sb.append('M');
                } else {
                    sb.append(mineCount);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}