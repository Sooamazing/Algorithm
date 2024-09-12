package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-10, 15 70min
// https://www.acmicpc.net/problem/5557
public class FirstGrade {
	static int[] arr;
	static int totalSize;
	static int gaolNum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		totalSize = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		arr = new int[totalSize];
		for (int i = 0; i < totalSize; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		gaolNum = arr[totalSize - 1];

		backtracking(1, new long[2]);
		backtracking(1, new long[2]);

		// dp 배열 for 해결 시도했으나 실패.
		// int[][] dp = new int[totalSize + 1][2];
		// dp[0][0] = dp[0][1] = 0;
		// for (int i = 1; i <= totalSize; i++) {
		// 	int curNum = Integer.parseInt(st.nextToken());
		// 	int plusSum = dp[i - 1][0] + curNum;
		// }

		System.out.println(result);

	}

	static long result;

	static void backtracking(int depth, long[] sums) {
		if (depth == totalSize - 1) {
			if (sums[0] == gaolNum) {
				result++;
			}
			if (sums[1] == gaolNum) {
				result++;
			}
			return;
		}

		// for (int i = curIdx; i < totalSize - 1; i++) {
		// long curSumPlus = sum + arr[depth];
		// if (curSumPlus >= 0 && curSumPlus <= 20) {
		// 	// backtracking(depth + 1, curSumPlus);
		// 	sums[0] = curSumPlus;
		// }
		//
		// long curSumMinus = sum - arr[depth];
		// if (curSumMinus >= 0 && curSumMinus <= 20) {
		// 	// backtracking(depth + 1, curSumMinus);
		// 	sums[1] = sums[0] = curSumPlus;
		// }
		// }
	}
}
