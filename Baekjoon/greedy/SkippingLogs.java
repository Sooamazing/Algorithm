package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-05-18 20min
// https://www.acmicpc.net/problem/11497
public class SkippingLogs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);

			int maxDiffer = Integer.MIN_VALUE;
			// int range = num % 2 == 0 ? num / 2 : num / 2 - 1;
			for (int i = 1; i < num / 2; i++) {
				maxDiffer = Math.max(maxDiffer, arr[i * 2] - arr[(i - 1) * 2]);
				maxDiffer = Math.max(maxDiffer, arr[i * 2 + 1] - arr[i * 2 - 1]);
			}
			// 홀수인 경우, 둘 다 양측 값 비교 필요.
			maxDiffer = Math.max(maxDiffer, arr[num - 1] - arr[num - 2]);
			maxDiffer = Math.max(maxDiffer, arr[num - 1] - arr[num - 3]);
			sb.append(maxDiffer).append("\n");
		}

		System.out.println(sb);

	}
}
