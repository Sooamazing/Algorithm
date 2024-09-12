package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-20 20min
public class HideAndSeek {
	static int[] dp;
	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int mePosition = Integer.parseInt(st.nextToken());
		int youngerPosition = Integer.parseInt(st.nextToken());
		size = Math.max(mePosition, youngerPosition) * 2 + 1;
		dp = new int[size];

		if (mePosition < youngerPosition) {
			calculateDp(mePosition, youngerPosition);
		} else {
			calculateDp(youngerPosition, mePosition);
		}

		System.out.println(dp[mePosition]);
	}

	// 내 위치가 GOAL, 동생 위치에서 내 위치를 찾아감.
	static void calculateDp(int goalPosition, int curPosition) {
		if (curPosition == goalPosition || curPosition + 1 >= size || curPosition <= 0) {
			return;
		}

		if (curPosition % 2 == 0) {
			dp[curPosition / 2]++;
			calculateDp(curPosition / 2, goalPosition);
		} else {
			dp[curPosition + 1]++;
			calculateDp(curPosition + 1, goalPosition);

			dp[curPosition - 1]++;
			calculateDp(curPosition - 1, goalPosition);
		}

	}
}
