// // https://www.acmicpc.net/problem/11501

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stock {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];

			String[] split = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(split[i]);
			}

			int[] maxArr = new int[N];
			long maxProfit = 0;
			int max = 0;
			for (int i = N - 1; i >= 0; i--) {

				int cur = arr[i];
				max = Math.max(max, cur);
				maxProfit += max - cur;

			}

			sb.append(maxProfit).append('\n');

		}

		System.out.println(sb);

	}
}
