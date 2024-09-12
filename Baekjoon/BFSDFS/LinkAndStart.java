package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinkAndStart {

	static int minDiffer;
	static int size, totalSum;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		arr = new int[size][size];

		for (int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < size; j++) {
				int num = Integer.parseInt(st.nextToken());
				arr[i][j] = num;
				totalSum += num;
			}
		}
		minDiffer = totalSum;
		for (int i = 2; i <= size - 2; i++) {
			tempSum = 0;
			calculate(0, i, 0, 0);
		}

		System.out.println(minDiffer);
	}

	static int tempSum;

	static void calculate(int depth, int goalDepth, int x, int y) {
		if (depth == goalDepth) {
			minDiffer = Math.min(minDiffer, totalSum - 2 * tempSum);
			return;
		}

		for (int i = x; i < size / 2 + size % 2; i++) {
			for (int j = y; j < size; j++) {
				if (i == j) {
					continue;
				}
				tempSum += (arr[i][j] + arr[j][i]);
				calculate(depth + 1, goalDepth, i, j + 1);
				tempSum -= (arr[i][j] + arr[j][i]);
			}
		}
	}
}
