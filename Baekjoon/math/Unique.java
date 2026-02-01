package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-01 10min
// https://www.acmicpc.net/problem/5533
public class Unique {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int player = Integer.parseInt(br.readLine());
        int[][] scores = new int[player][3];
        for (int i = 0; i < player; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 3; i++) {
            int[] count = new int[101];
            for (int j = 0; j < player; j++) {
                count[scores[j][i]]++;
            }

            for (int j = 0; j < player; j++) {
                if (count[scores[j][i]] > 1) {
                    scores[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < player; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}