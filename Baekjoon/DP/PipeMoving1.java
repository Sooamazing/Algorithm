package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-06 45min
// https://www.acmicpc.net/problem/17070
public class PipeMoving1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[][] house = new int[total + 1][total + 1];
		int[][][] dp = new int[3][total + 1][total + 1];
		StringTokenizer st;
		for (int i = 1; i < total + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < total + 1; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());

				// 초기 파이프 값 설정
				if (i == 1 && j == 2) {
					dp[0][1][2] = 1; // 시작은 파이프가 가로로 누워 있음.
					continue;
				}

				// 현재 있는 곳이 벽이면 제외
				if (house[i][j] == 1) {
					continue;
				}

				// 이전 파이프 방향 끝이 가로이고, 가로로 뚫린 경우
				if (house[i][j - 1] == 0) {
					// 가로, 대각선 둘 다에서 올 수 있음.
					dp[0][i][j] = dp[0][i][j - 1] + dp[2][i][j - 1];
				}
				// 이전 파이프 방향 끝이 세로이고, 세로로 뚫린 경우
				if (house[i - 1][j] == 0) {
					// 세로, 대각선 둘 다에서 올 수 있음.
					dp[1][i][j] = dp[1][i - 1][j] + dp[2][i - 1][j];
				}
				// 이전 파이프 방향 끝이 대각선이고, 가로, 대각선, 세로 전부 뚫린 경우
				if (house[i - 1][j - 1] == 0 && house[i - 1][j] == 0 && house[i][j - 1] == 0) {
					// 가로, 세로, 대각선 전부에서 올 수 있음.
					dp[2][i][j] = dp[0][i - 1][j - 1] + dp[1][i - 1][j - 1] + dp[2][i - 1][j - 1];
				}
			}
		}

		System.out.println(dp[0][total][total] + dp[1][total][total] + dp[2][total][total]);
	}
}
