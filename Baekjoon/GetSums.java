// https://www.acmicpc.net/problem/11441

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetSums {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] sums = new int[N + 1];

		String[] split = br.readLine().split(" ");
		for (int i = 1; i < N + 1; i++) {
			sums[i] = Integer.parseInt(split[i - 1]) + sums[i - 1];
		}

		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			split = br.readLine().split(" ");
			int curSum = sums[Integer.parseInt(split[1])] - sums[Integer.parseInt(split[0]) - 1];

			sb.append(curSum).append('\n');

		}

		System.out.println(sb);

	}
}
