package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-03-13 10min
// https://www.acmicpc.net/problem/11060
public class JumpJump {
	private static final int MAX = 1_001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[] dp = new int[total];
		Arrays.fill(dp, MAX); // 최소를 찾아야 하기 때문에 최댓값으로 초기화

		StringTokenizer st = new StringTokenizer(br.readLine());
		dp[0] = 0; // 맨 처음은 0으로 초기화.
		for (int i = 0; i < total; i++) {
			int maxJump = Integer.parseInt(st.nextToken());
			for (int j = 1; j <= maxJump; j++) {
				int mazeX = i + j;
				if (mazeX >= total) {
					continue;
				}
				dp[mazeX] = Math.min(dp[mazeX], dp[i] + 1);
			}
		}

		System.out.println(dp[total - 1] == MAX ? -1 : dp[total - 1]);

	}
}
