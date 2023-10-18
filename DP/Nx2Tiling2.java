package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nx2Tiling2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] dp = new int[N + 1];
		//입력 및 초기화 완료

		dp[1] = 1;
		if (N >= 2) {
			dp[2] = 3;
		}
		for (int i = 3; i < N + 1; i++) {
			dp[i] = (2 * dp[i - 2] + dp[i - 1]) % 10007;
		}
		System.out.println(dp[N]);
	}
}
