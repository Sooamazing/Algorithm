package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-02 30min (참고)
// 참고: https://suhyeokeee.tistory.com/22
// https://www.acmicpc.net/problem/12101
public class Plus123_2 {
	static int number, order;
	static boolean flag = false;
	static int cnt = 0;
	static int dp[] = new int[12];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		number = Integer.parseInt(st.nextToken());
		order = Integer.parseInt(st.nextToken());

		int[] numbers = new int[number];

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		calculate(0, 0);
		if (!flag) {
			System.out.println(-1);
		}
	}

	public static void calculate(int num, int level) {
		if (num > number) {
			return;
		}
		if (num == number) {
			cnt++;
			if (cnt == order) {
				flag = true;
				for (int i = 0; i < level - 1; i++) {
					System.out.print(dp[i] + "+");
				}
				System.out.println(dp[level - 1]);
			}
			return;
		}
		for (int i = 1; i <= 3; i++) {
			dp[level] = i;
			calculate(num + i, level + 1);
		}
		return;
	}

	// static void calculate(int[] numbers, int order) {
	// 	if (order == 0) {
	// 		for (int i = 0; i < numbers.length; i++) {
	// 			System.out.print(numbers[i] + " ");
	// 		}
	// 		System.out.println();
	// 		return;
	// 	}
	//
	// 	for (int i = 1; i <= 3; i++) {
	// 		numbers[numbers.length - order] = i;
	// 		calculate(numbers, order - 1);
	// 	}
	// }
}
