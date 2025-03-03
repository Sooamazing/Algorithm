package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-03 35min
// https://www.acmicpc.net/problem/9184
public class ExcitingFunctionExecutor {
	private static int[][][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		dp = new int[21][21][21];

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			// 종료 조건
			if (a == -1 && b == -1 && c == -1) {
				break;
			}

			int result = calc(a, b, c);
			// 출력 방식
			// w(a, b, c) = result\n
			sb.append("w(" + a + ", " + b + ", " + c + ") = " + result + "\n");
		}

		System.out.println(sb);

	}

	private static int calc(int a, int b, int c) {

		// a <= 0 or b <= 0 or c <= 0 -> 1
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			//  w(20, 20, 20)
			return calc(20, 20, 20);
		}

		if (dp[a][b][c] != 0) {
			return dp[a][b][c];
		} else if (a < b && b < c) {
			//  a < b and b < c
			// w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
			return dp[a][b][c] = calc(a, b, c - 1) + calc(a, b - 1, c - 1) - calc(a, b - 1, c);
		} else {
			// w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
			return dp[a][b][c] =
				calc(a - 1, b, c) + calc(a - 1, b - 1, c) + calc(a - 1, b, c - 1) - calc(a - 1, b - 1, c - 1);
		}
	}
}
