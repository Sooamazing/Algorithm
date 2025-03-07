package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-07 20min
// https://www.acmicpc.net/problem/18353
public class PlacingSoldiers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int[] dp = new int[total + 1];
		int[] powers = new int[total + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		// 병사 전투력 입력
		for (int i = 1; i <= total; i++) {
			powers[i] = Integer.parseInt(st.nextToken());
		}

		// 각 순서에 본인을 포함시키기 위해 0번째에 최대 전투력을 초과하는 전투력 할당(내림차순이라)
		powers[0] = 10_000_001;

		// 줄 세우기, LIS
		int max = 0;
		for (int i = 1; i <= total; i++) {
			int currentSoldier = powers[i];
			for (int j = 0; j <= i; j++) {
				// 내림차순 맞는지 확인하고, 최대값 갱신
				if (powers[j] > currentSoldier && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			max = Math.max(max, dp[i]);
		}

		int out = total - max;
		System.out.println(out);
	}
}
