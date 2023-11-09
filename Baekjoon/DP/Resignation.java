package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Resignation {
	// public static void main(String[] args) throws IOException {
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//
	// 	int N = Integer.parseInt(br.readLine());
	// 	int[][] dp = new int[N + 5 + 1][6];
	//
	// 	for (int i = 1; i < N + 1; i++) {
	//
	// 		StringTokenizer st = new StringTokenizer(br.readLine());
	// 		int a = Integer.parseInt(st.nextToken());
	// 		if (i + a - 1 < N + 1) {
	// 			dp[i + a + 5 - 1][a] = Integer.parseInt(st.nextToken());
	// 		}
	//
	// 	}// 입력 및 초기화 완료
	//
	// 	for (int i = 6; i < N + 5 + 1; i++) {
	//
	// 		dp[i][0] =
	// 			Math.max(
	// 				Math.max(
	// 					dp[i - 1][0] + dp[i][1],
	// 					dp[i - 2][0] + dp[i][2]),
	// 				Math.max(
	// 					Math.max(
	// 						dp[i - 3][0] + dp[i][3],
	// 						dp[i - 4][0] + dp[i][4]),
	// 					dp[i - 5][0] + dp[i][5]));
	//
	// 	}
	//
	// 	System.out.println(dp[N + 5][0]);
	//
	// }

	public static void main(String[] args) throws Exception {
		p_14501();
	}

	/**
	 * 2022/08/05->1
	 */
	static int N14501;
	static int[] tArr14501;
	static int[] pArr14501;
	static int result14501 = 0;
	static void p_14501() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N14501 = Integer.parseInt(br.readLine());

		tArr14501 = new int[N14501+1];
		pArr14501 = new int[N14501+1];

		for (int i = 1; i <= N14501; i++) {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(tokenizer.nextToken());
			int P = Integer.parseInt(tokenizer.nextToken());
			tArr14501[i] = T;
			pArr14501[i] = P;
		}

		for (int i = 1; i <= N14501; i++) { // left Pointer
			findMaxPriceSum14501(i, 0);
		}

		System.out.println(result14501);
	}

	private static void findMaxPriceSum14501(int idx, int pSum) {
		if(idx + tArr14501[idx] > N14501 + 1) return;
		pSum += pArr14501[idx];
		idx += tArr14501[idx];
		System.out.println("idx = " + idx+", pSum = " + pSum);


		for (int i = idx; i <= N14501; i++) {
			System.out.println("before: i = " + i);
			findMaxPriceSum14501(i, pSum);
			System.out.println("after: i = " + i);
		}


		System.out.println("pSum = " + pSum+", result14501 = " + result14501);
		System.out.println();
		result14501 = Math.max(pSum, result14501);
	}
}
