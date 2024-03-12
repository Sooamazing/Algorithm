package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 22:05 ~ 22:30
// https://www.acmicpc.net/problem/1932
public class IntegerTriangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int triangleSize = Integer.parseInt(br.readLine());

		int[][] triangle = new int[triangleSize][triangleSize];

		int max = triangle[0][0] = Integer.parseInt(br.readLine());
		for (int i = 1; i < triangleSize; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j <= i; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
				if (j == 0) {
					triangle[i][j] += triangle[i - 1][j];
				} else if (j == i) {
					triangle[i][j] += triangle[i - 1][j - 1];
				} else {
					triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
				}
				max = Math.max(triangle[i][j], max);
			}
		}

		System.out.println(max);

	}
}
