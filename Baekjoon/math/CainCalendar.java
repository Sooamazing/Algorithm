package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-19 40min 시간 초과
// https://www.acmicpc.net/problem/6064
public class CainCalendar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCaseNum = Integer.parseInt(br.readLine());

		StringTokenizer st;
		while (testCaseNum-- > 0) {
			st = new StringTokenizer(br.readLine());

			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int ans = -1;
			for (int i = 1; i <= M * N; i++) {
				if ((i - x) < 0 || (i - y) < 0)
					continue;
				if ((i - x) % M == 0
					&& (i - y) % N == 0) {
					ans = i;
					break;
				}
			}

			// for (int i = 0; i <= 40000; i += M) {
			//
			// 	if (((i + x) - y) % N == 0) {
			// 		ans = i + x;
			// 		break;
			// 	}
			//
			// 	// if ((i - 1) % N + 1 == y) {
			// 	// 	ans = i;
			// 	// 	break;
			// 	// }
			// }

			sb.append(ans).append("\n");

			// copilot
			// String[] input = br.readLine().split(" ");
			// int M = Integer.parseInt(input[0]);
			// int N = Integer.parseInt(input[1]);
			// int x = Integer.parseInt(input[2]);
			// int y = Integer.parseInt(input[3]);
			//
			// int ans = -1;
			// for(int i = x; i <= M * N; i += M) {
			// 	if((i - 1) % N + 1 == y) {
			// 		ans = i;
			// 		break;
			// 	}
			// }
			//
			// sb.append(ans).append("\n");
		}

		System.out.println(sb);

	}
}
