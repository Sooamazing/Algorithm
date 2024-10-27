package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-27 10min
// https://www.acmicpc.net/problem/2563
public class ColoredPaper {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int total = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[10 * 100 + 1][10 * 100 + 1];

		int sum = 0;
		for (int i = 0; i < total; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					// 예제에서 왼쪽 아래에 원점이 있어서 y를 빼지 않고 더해줌.
					if (paper[y + j][x + k]) {
						continue;
					}
					paper[y + j][x + k] = true;
					sum++;
				}
			}
		}

		System.out.println(sum);
	}
}
