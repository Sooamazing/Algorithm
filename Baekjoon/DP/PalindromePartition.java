package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-08-22 25min
// 25-03-00 35min, 25-04-13 25min
// https://www.acmicpc.net/problem/2705
public class PalindromePartition {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		int[] dp = new int[1_000 + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		for (int i = 4; i <= 1_000; i++) {
			int sum = 1; // 자기 자신
			for (int j = i - 2; j >= 0; j -= 2) {
				int index = (i - j) / 2;
				sum += dp[index];
			}
			dp[i] = sum;
		}
		while (testCase-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int ans = dp[num];

			// ans = getPalindromePartition(0, num, 0);

			sb.append(ans).append("\n");
		}

		System.out.println(sb);
	}

	static int[] temp = new int[20];

	static int getPalindromePartition(int sum, int goal, int depth) {
		int ans = 0;

		if (sum == goal) {
			System.out.println("depth: " + depth + ", " + Arrays.toString(temp));
			return 1;
		}

		for (int i = 1; i <= goal; i++) {
			if (sum + 1 > goal) {
				continue;
			}
			if (sum + i == goal) {
				System.out.println("sum + i == goal // depth: " + depth + ", " + Arrays.toString(temp));
				ans++;
				break;
			}
			temp[depth] = i;
			ans += getPalindromePartition(sum + i * 2, goal, depth + 1);
		}

		return ans;
	}
}
