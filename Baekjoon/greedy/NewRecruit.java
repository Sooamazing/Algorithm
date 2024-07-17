package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 23-09-05, 06, 24-07-17 60+15min
// https://www.acmicpc.net/problem/1946
public class NewRecruit {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			int size = Integer.parseInt(br.readLine());

			// pq, arr 중 arr
			int[][] grades = new int[size][2];
			StringTokenizer st;
			for (int i = 0; i < size; i++) {
				st = new StringTokenizer(br.readLine());
				int document = Integer.parseInt(st.nextToken());
				int interview = Integer.parseInt(st.nextToken());

				grades[i][0] = document;
				grades[i][1] = interview;
			}

			Arrays.sort(grades, (o1, o2) -> {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}); // 서류 심사 1등부터 오름차순.

			int ans = 1; // 서류 심사 1등은 붙음.
			int prevInt = grades[0][1];
			for (int i = 1; i < size; i++) {
				int curInt = grades[i][1];

				if (prevInt > curInt) {
					ans++;
					prevInt = grades[i][1];
				}
			}

			sb.append(ans).append("\n");

			// copilot
			// int[] ranks = new int[size + 1];
			//
			// for (int i = 0; i < size; i++) {
			// 	String[] input = br.readLine().split(" ");
			// 	int document = Integer.parseInt(input[0]);
			// 	int interview = Integer.parseInt(input[1]);
			// 	ranks[document] = interview;
			// }
			//
			// int ans = 1;
			// int min = ranks[1];
			// for (int i = 2; i <= size; i++) {
			// 	if (min > ranks[i]) {
			// 		min = ranks[i];
			// 		ans++;
			// 	}
			// }
			//
			// sb.append(ans).append("\n");
		}
		System.out.println(sb);

	}
}
