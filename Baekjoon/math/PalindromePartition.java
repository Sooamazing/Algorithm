package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-08-22 25min
// https://www.acmicpc.net/problem/2705
public class PalindromePartition {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int ans = 0;

			ans = getPalindromePartition(0, num, 0);
			System.out.println();
			System.out.println();
			System.out.println();
			sb.append(ans).append("\n");
		}

		System.out.println(sb);
	}

	static int[] temp = new int[20];

	static int getPalindromePartition(int sum, int goal, int depth) {
		int ans = 0;

		if (sum == goal) {
			System.out.println("depth: " + depth + ", " + Arrays.toString(temp));
			return 1;
		}

		for (int i = 1; i <= goal; i++) {
			if (sum + 1 > goal) {
				continue;
			}
			if (sum + i == goal) {
				System.out.println("sum + i == goal // depth: " + depth + ", " + Arrays.toString(temp));
				ans++;
				break;
			}
			temp[depth] = i;
			ans += getPalindromePartition(sum + i * 2, goal, depth + 1);
		}

		return ans;
	}
}
