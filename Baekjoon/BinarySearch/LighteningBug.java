package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-07-04 30min
// https://www.acmicpc.net/problem/3020
public class LighteningBug {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());

		// int[][] cave = new int[height][width];
		int[] bottom = new int[height + 1];
		for (int i = 1; i <= width; i++) {
			int stoneH = Integer.parseInt(br.readLine());
			if (i % 2 != 0) {
				// 홀수번째면 아래에서 올라옴
				for (int j = 1; j <= stoneH; j++) {
					bottom[j]++;
				}
			} else {
				// 짝수째면 위에서 내려옴.
				for (int j = height - stoneH + 1; j <= height; j++) {
					bottom[j]++;
				}
			}
		}

		Arrays.sort(bottom);
		int min = bottom[1];
		int cnt = 1;
		for (int i = 2; i <= height; i++) {
			if (bottom[i] == min) {
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(min + " " + cnt);

	}
}
