package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-06 15min - 시간 초과..
// https://www.acmicpc.net/problem/14651
public class WalkedAndFoundSincheonStation_Large {

	static int goalDigit;
	static int[] nums = new int[] {0, 1, 2};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		goalDigit = Integer.parseInt(br.readLine());

		calc(1, 1);
		calc(2, 1);

		System.out.println(ans);
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
