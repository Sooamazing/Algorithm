package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-18 60min
// https://www.acmicpc.net/problem/16967
public class RestoreArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int originHeight = Integer.parseInt(st.nextToken());
        int originWidth = Integer.parseInt(st.nextToken());
        int hDistance = Integer.parseInt(st.nextToken());
        int wDistance = Integer.parseInt(st.nextToken());

        int[][] originArr = new int[originHeight][originWidth];
        int crossedHeight = originHeight + hDistance;
        int crossedWidth = originWidth + wDistance;
        int[][] crossedArr = new int[crossedHeight][crossedWidth];
        boolean[][] visited = new boolean[originHeight][originWidth];

        for (int i = 0; i < crossedHeight; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < crossedWidth; j++) {
                crossedArr[i][j] = Integer.parseInt(st.nextToken());
                if (i == 0 && j < originWidth) {
                    originArr[i][j] = crossedArr[i][j];
                    visited[i][j] = true;
                } else if (i == (crossedHeight - 1) && wDistance <= j) {
                    originArr[(originHeight - 1)][j - wDistance] = crossedArr[i][j];
                    visited[(originHeight - 1)][j - wDistance] = true;
                } else if (j == 0 && i < originHeight) {
                    originArr[i][j] = crossedArr[i][j];
                    visited[i][j] = true;
                } else if (j == (crossedWidth - 1) && hDistance <= i) {
                    originArr[(i - hDistance)][(originWidth - 1)] = crossedArr[i][j];
                    visited[(i - hDistance)][(originWidth - 1)] = true;
                }
            }
        }

        for (int i = 1; i < originHeight; i++) {
            for (int j = 1; j < originWidth; j++) {
                if (visited[i][j]) {
                    continue;
                }
                visited[i][j] = true;
                // 겹치면 crossedArr - 해당 originArr-distance?
                // 겹치다? 범위 내인지... hDistance, wDistance (뺄셈)
                boolean crossed =
                        hDistance <= i && i < originHeight && wDistance <= j && j < originWidth;
                if (crossed) {
                    originArr[i][j] = crossedArr[i][j] - originArr[i - hDistance][j - wDistance];
                } else {
                    originArr[i][j] = crossedArr[i][j];
                }
            }
        }

        for (int i = 0; i < originHeight; i++) {
            for (int j = 0; j < originWidth; j++) {
                sb.append(originArr[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}