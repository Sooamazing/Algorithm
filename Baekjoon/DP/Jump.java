package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-19 20min
// https://www.acmicpc.net/problem/1890
// 참고: https://seokjin2.tistory.com/194
public class Jump {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		int[][] board = new int[size][size];
		long[][] dp = new long[size][size];
		int[] dx = {1, 0};
		int[] dy = {0, 1};

		for (int i = 0; i < size; i++) {
			String[] split = br.readLine().split(" ");
			for (int j = 0; j < size; j++) {
				board[i][j] = Integer.parseInt(split[j]);
			}
		}

		dp[0][0] = 1;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (dp[i][j] == 0 || board[i][j] == 0)
					continue;
				for (int dir = 0; dir < 2; dir++) {
					int nx = i + dx[dir] * board[i][j];
					int ny = j + dy[dir] * board[i][j];
					if (nx < 0 || ny < 0 || nx >= size || ny >= size)
						continue;
					dp[nx][ny] += dp[i][j];
				}

			}
		}

		System.out.println(dp[size - 1][size - 1]);

	}
}
