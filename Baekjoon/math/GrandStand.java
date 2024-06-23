package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-23 40min
// https://www.acmicpc.net/problem/10166
// 참고: https://redbinalgorithm.tistory.com/199
public class GrandStand {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		boolean[][] visit = new boolean[end + 1][end + 1];

		int result = 1;
		for (int i = start; i <= end; i++) {
			for (int j = 1; j < i; j++) {
				// 최대공약수, j<i
				int min = getGCD(i, j);
				int tempI = i / min;
				int tempJ = j / min;
				if (!visit[tempI][tempJ]) {
					visit[tempI][tempJ] = true;
					result++;
					// for (int k = 2; tempI * k <= end; k++) {
					// 	visit[tempI * k][tempJ * k] = true;
					// }
				}
			}
		}
		System.out.println(result);
	}

	private static int getGCD(int i, int j) {
		// i>j
		while (j != 0) {
			int min = i % j;
			i = j;
			j = min;
		}
		return i;
		// for (int k = min; k > 0; k--) {
		// 	if (i % k == 0 && j % k == 0) {
		// 		min = k;
		// 		break;
		// 	}
		// }
		// return min;
	}
}
