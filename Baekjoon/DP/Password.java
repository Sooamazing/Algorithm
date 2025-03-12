package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 25-03-11, 12 55min
// https://www.acmicpc.net/problem/2780
// 참고: https://www.acmicpc.net/board/view/3086
public class Password {
	private final static int MOD_NUMBER = 1_234_567;
	private static int[] adjNumberSize = new int[] {1, 2, 3, 2, 3, 4, 3, 3, 3, 2};
	private static List<int[]> adjNumberList = List.of(
		new int[] {7},
		new int[] {2, 4},
		new int[] {1, 3, 5},
		new int[] {2, 6},
		new int[] {1, 5, 7},
		new int[] {2, 4, 6, 8},
		new int[] {3, 5, 9},
		new int[] {4, 8, 0},
		new int[] {5, 7, 9},
		new int[] {6, 8}
	);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());
		long[][] dp = new long[1000 + 1][10];
		// 1개일 때
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1;
		}
		for (int i = 2; i <= 1000; i++) {
			dp[i][0] = (dp[i - 1][7]) % MOD_NUMBER;
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][4]) % MOD_NUMBER;
			dp[i][2] = (dp[i - 1][1] + dp[i - 1][3] + dp[i - 1][5]) % MOD_NUMBER;
			dp[i][3] = (dp[i - 1][2] + dp[i - 1][6]) % MOD_NUMBER;
			dp[i][4] = (dp[i - 1][1] + dp[i - 1][5] + dp[i - 1][7]) % MOD_NUMBER;
			dp[i][5] = (dp[i - 1][2] + dp[i - 1][4] + dp[i - 1][6] + dp[i - 1][8]) % MOD_NUMBER;
			dp[i][6] = (dp[i - 1][3] + dp[i - 1][5] + dp[i - 1][9]) % MOD_NUMBER;
			dp[i][7] = (dp[i - 1][4] + dp[i - 1][8] + dp[i - 1][0]) % MOD_NUMBER;
			dp[i][8] = (dp[i - 1][5] + dp[i - 1][7] + dp[i - 1][9]) % MOD_NUMBER;
			dp[i][9] = (dp[i - 1][6] + dp[i - 1][8]) % MOD_NUMBER;
		}

		while (test-- > 0) {
			int length = Integer.parseInt(br.readLine());
			long result = 0;
			for (int i = 0; i < 10; i++) {
				result = (result + dp[length][i]) % MOD_NUMBER;
			}
			// for (int i = 0; i < 10; i++) {
			// 	result += bfs(i, length);
			// }
			sb.append(result).append("\n");
		}

		System.out.println(sb);

	}

	private static int bfs(int firstNumber, int length) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {firstNumber, 1}); // 숫자, depth, 개수

		int count = 0;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int number = poll[0];
			int depth = poll[1];

			if (depth == length) {
				count = (count + 1) % 1_234_567;
				continue;
			}

			int size = adjNumberSize[number];
			for (int i = 0; i < size; i++) {
				int adjNumber = adjNumberList.get(number)[i];
				que.add(new int[] {adjNumber, depth + 1});
			}
		}

		return count;
	}
}
