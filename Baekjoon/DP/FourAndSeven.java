package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-08-18 60min
// https://www.acmicpc.net/problem/2877
public class FourAndSeven {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goal = Integer.parseInt(br.readLine()) + 1; // 2부터 시작할 예정이라 +1

		// long[] dp = new long[goal + 2];
		// dp[2] = 4;
		// dp[3] = 7;

		// 메모리 초과
		// for (int i = 4; i < goal + 1; i++) {
		// 	int curPow = (int)(Math.log(i) / Math.log(2));
		// 	long stdCurNum = (long)Math.pow(2, curPow);
		// 	int prevPow = curPow - 1;
		// 	long stdPrevNum = (long)Math.pow(2, prevPow);
		// 	if (i < stdPrevNum + stdCurNum) {
		// 		dp[i] = 4 * (int)Math.pow(10, prevPow) + dp[(int)(i - stdPrevNum)];
		// 	} else {
		// 		dp[i] = 7 * (int)Math.pow(10, prevPow) + dp[(int)(i - stdPrevNum * 2)];
		// 	}
		// }
		//
		// System.out.println(dp[goal]);

		System.out.println(getNum(goal));
	}

	// 1000000000 X
	static long getNum(long num) {
		if (num == 2) {
			return 4;
		} else if (num == 3) {
			return 7;
		}
		int curPow = (int)(Math.log(num) / Math.log(2));
		long stdCurNum = (long)Math.pow(2, curPow);
		int prevPow = curPow - 1;
		long stdPrevNum = (long)Math.pow(2, prevPow);
		if (num < stdPrevNum + stdCurNum) {
			return 4 * (long)Math.pow(10, prevPow) + getNum(num - stdPrevNum);
		} else {
			return 7 * (long)Math.pow(10, prevPow) + getNum(num - stdPrevNum * 2);
		}
	}
}
