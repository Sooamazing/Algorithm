package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-14 23
// https://www.acmicpc.net/problem/1531
public class Transparent {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());

		int[][] picture = new int[101][101];
		for (int i = 0; i < total; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int j = x1; j <= x2; j++) {
				for (int k = y1; k <= y2; k++) {
					picture[j][k]++;
				}
			}
		}

		int result = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (picture[i][j] > min) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
