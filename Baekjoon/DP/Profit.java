package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-25 20min, 25-03-31 35min
// https://www.acmicpc.net/problem/4097
public class Profit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		final int SEQUENCE = 0;
		final int MAX = 1;

		while (true) {
			int day = Integer.parseInt(br.readLine());
			if (day == 0) {
				break;
			}
			long[][] profits = new long[day + 1][2];
			for (int i = 1; i <= day; i++) {
				int profit = Integer.parseInt(br.readLine());

				// 첫 구간 초기화
				if (i == 1) {
					profits[i][SEQUENCE] = profits[i][MAX] = profit;
					continue;
				}
				// 구간이라는 건 하나만 있는 경우도 포함이라 1~2로 초기화하지 않아도 됨.
				// if (i == 2) {
				// 	profits[i][SEQUENCE] = profits[i][MAX] += profit;
				// 	continue;
				// }
				profits[i][SEQUENCE] = Math.max(profits[i - 1][SEQUENCE] + profit, profit);
				profits[i][MAX] = Math.max(profits[i][SEQUENCE], profits[i - 1][MAX]);
			}

			sb.append(profits[day][MAX] + "\n");

			// 시간 초과
			// int[] profits = new int[day + 1];
			// int max = Integer.MIN_VALUE;
			// for (int i = 1; i <= day; i++) {
			// 	int profit = Integer.parseInt(br.readLine());
			// 	profits[i] = profit;
			// 	int sum = profit;
			// 	max = Math.max(max, sum);
			// 	for (int j = i - 1; j >= 1; j--) {
			// 		sum += profits[j];
			// 		max = Math.max(max, sum);
			// 	}
			// }
			// sb.append(max + "\n");
		}

		System.out.println(sb);
	}
}
