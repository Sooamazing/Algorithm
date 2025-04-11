package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-06 15min - 시간 초과..
// 25-04-11 5min
// https://www.acmicpc.net/problem/14651
public class WalkedAndFoundSincheonStationLarge {

	static int goalDigit;
	static int[] nums = new int[] {0, 1, 2};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		goalDigit = Integer.parseInt(br.readLine());
		if (goalDigit == 1) {
			System.out.println(0);
			return;
		}
		final int MOD = 1_000_000_009;

		// 최댓값인 33333으로 할 경우, Math.pow의 결과가 infinity라서 실패.
		// double pow = Math.pow(3, goalDigit - 2);
		// long threePow = (long)(pow % MOD);
		// int result = (int)((2 * threePow) % MOD);

		int result = 2;
		for (int i = 3; i <= goalDigit; i++) {
			result = (int)(((long)result * 3) % MOD);
		}
		System.out.println(result);

		// 시간 초과
		// calc(1, 1);
		// calc(2, 1);

		// System.out.println(ans);
	}

	static int ans;

	static void calc(int curSum, int depth) {
		if (depth == goalDigit) {
			// 합이 3의 배수이면 정답.
			if (curSum % 3 == 0) {
				ans = ((ans + 1) % 1_000_000_009);
			}
			return;
		}

		calc(curSum, depth + 1);
		calc(curSum + 1, depth + 1);
		calc(curSum + 2, depth + 1);
	}
}
