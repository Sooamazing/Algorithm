package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-14 10min
// https://www.acmicpc.net/problem/1547
public class Ball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		boolean[] balls = new boolean[4];
		balls[1] = true;

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int xIndex = Integer.parseInt(st.nextToken());
			int yIndex = Integer.parseInt(st.nextToken());
			swap(balls, xIndex, yIndex);
		}

		for (int i = 1; i < 4; i++) {
			if (balls[i]) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

	private static void swap(boolean[] balls, int xIndex, int yIndex) {
		if (xIndex > 3 || yIndex > 3) {
			balls[yIndex] = false;
			balls[xIndex] = false;
			return;
		}
		boolean temp = balls[yIndex];
		balls[yIndex] = balls[xIndex];
		balls[xIndex] = temp;
	}
}
