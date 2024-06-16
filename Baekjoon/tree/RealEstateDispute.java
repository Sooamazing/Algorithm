package Baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-16 30min
// https://www.acmicpc.net/problem/20364
public class RealEstateDispute {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int landNum = Integer.parseInt(st.nextToken());
		int duckNum = Integer.parseInt(st.nextToken());

		// int[] lands = new int[landNum + 1];
		boolean[] lands = new boolean[landNum + 1];

		for (int i = 0; i < duckNum; i++) {
			int duckLand = Integer.parseInt(br.readLine());

			int curLand = duckLand;
			boolean cannot = false;
			int cannotLand = Integer.MAX_VALUE;

			while (curLand > 1) {
				// 원하는 땅이 중복인 경우 포함 계산
				if (lands[curLand]) {
					cannot = true;
					cannotLand = Math.min(cannotLand, curLand);
				}
				if (curLand % 2 == 0) {
					curLand /= 2;
				} else {
					curLand = (curLand - 1) / 2;
				}
			}

			if (cannot) {
				sb.append(cannotLand).append("\n");
			} else {
				lands[duckLand] = true;
				sb.append(0).append("\n");
			}

			// copilot
			// int result = 0;
			// for (int j = curLand; j > 0; j /= 2) {
			// 	if (lands[j] == 1) {
			// 		result = j;
			// 	}
			// }
			// if (result == 0) {
			// 	lands[curLand] = 1;
			// }
			// sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
